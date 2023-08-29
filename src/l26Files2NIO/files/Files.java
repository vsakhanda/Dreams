package l26Files2NIO.files;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Files {

    public static void main(String[] args) {
        File parentDir = makeDir("filesDir");
        File child = new File(parentDir,"file.txt");
        InputStream inputStream = null;
        try {
            System.out.println(child.getPath() + " Шлях до файла");  // отримуємо шлях до папки
            System.out.println(child.getCanonicalPath() + " Канонізований шлях до файла"); // канонізований шлях до папки
            System.out.println(child.getAbsolutePath() + " Абсолютний шлях до файла"); // абсолютний шлях до файлу
            System.out.println(child.createNewFile()); // створює новий файл
            writeSampleDataToFile(child); // виконує запис даних в файл
            inputStream = new FileInputStream(child);
            System.out.println(readFromInputStream(inputStream));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        try (InputStream inputStreamWithResources = new FileInputStream(child)){
            System.out.println("Read with try catch with Resources");
            System.out.println(readFromInputStream(inputStreamWithResources));
        }catch (IOException e){
            throw new RuntimeException();
        }

        System.out.println("**** NIO ***");
        //nio
        /*
            Java NIO вводить два нових основних класи: Paths та Files.
            Paths використовується для створення об'єктів Path,
            які можуть представляти шляхи до файлів або каталогів.
            Files надає набір статичних методів для роботи з файлами та каталогами.
         */
        Path path = Paths.get("filesDir/file.txt");

        try (BufferedReader reader = java.nio.file.Files.newBufferedReader(path);){
            System.out.println("Java NIO");
            byte[] bytes = java.nio.file.Files.readAllBytes(path);
            /*
            Атрибути файлів:
            Java NIO дозволяє читати та встановлювати більш різноманітні атрибути файлів.
            Наприклад, ви можете отримати базову інформацію про файл, таку як розмір, дата створення, дата модифікації тощо.
             */
            BasicFileAttributes attrs = java.nio.file.Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Creation Time: " + attrs.creationTime());
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //DirectoryStream:
        /*
            Ви можете перебирати файли в каталозі без необхідності завантаження їх усіх у пам'ять. Це корисно для роботи з великими каталогами.
         */
        System.out.println("DirectoryStream");
        Path folderPath = Paths.get("filesDir");
        try (DirectoryStream<Path> directoryStream = java.nio.file.Files.newDirectoryStream(folderPath)) {
            for (Path file : directoryStream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("NIO Files method");
            Stream<String> lines = java.nio.file.Files.lines(path);
            String data = lines.collect(Collectors.joining("\n"));
            lines.close();
            System.out.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*  для більш гнучкої роботи з файлами :
            Memory-mapped Files:

            Java NIO дозволяє вам створювати файл, який буде відображений у пам'ять.
            Це дозволяє JVM працювати з файлом, ніби це частина звичайної пам'яті, що може збільшити швидкість читання/запису.
            розбирали цей приклад в каналах :
            RandomAccessFile raf = new RandomAccessFile("/tmp/myfile.txt", "rw");
            FileChannel fileChannel = raf.getChannel();
            MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, raf.length());

            Асинхронна робота з файлами:
            Java NIO.2 вводить асинхронний варіант роботи з файлами за допомогою AsynchronousFileChannel.
            Це забезпечує не блокуючу роботу з файлами, яка може покращити продуктивність при правильному застосуванні.
         */
    }

    private static File makeDir(String name) {
        File directory = new File(name);

        // If the directory already exists, make sure we create it 'from scratch', i.e. all the files inside are deleted first
        if (directory.exists()) {
            removeDir(directory);
        }

        if (directory.mkdir()) {
            return directory;
        }

        throw new RuntimeException("'" + name + "' not made!");
    }

    private static void removeDir(File directory) {
        // make sure you don't delete your home directory here
        String home = System.getProperty("user.home");
        if (directory.getPath().equals(home)) {
            return;
        }

        // remove directory and its files from system
        if (directory.exists()) {
            // delete all files inside the directory
            File[] dirFiles = directory.listFiles();
            if (dirFiles != null) {
                List<File> files = Arrays.asList(dirFiles);
                files.forEach(f -> deleteFile(f));
            }

            // finally delete the directory itself
            deleteFile(directory);
        }
    }

    private static void deleteFile(File fileToDelete) {
        if (fileToDelete != null && fileToDelete.exists()) {
            fileToDelete.delete();
        }
    }

    private static void writeSampleDataToFile(File sample) throws IOException {
        //write sample text to file
        try (FileOutputStream out = new FileOutputStream(sample)) {
            for (int i = 1; i <= 15; i++) {
                String text = "Sample line number " + i + "\n";
                out.write(text.getBytes());
            }
        }
    }

    private static String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }

        return resultStringBuilder.toString();
    }

}
