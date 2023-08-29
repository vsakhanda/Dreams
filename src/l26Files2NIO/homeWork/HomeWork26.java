package l26Files2NIO.homeWork;


//Переробити програму з минулого завдання - але використовувати методи с пакету NIO

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork26 {

    public static void main(String[] args) {
        File parentDir = makeDir("filesDir");
        File child = new File(parentDir,"HomeWork26.txt");
        InputStream inputStream = null;
        try {
            System.out.println(child.getPath() + "Короткий шлях до файлу");
            System.out.println(child.getCanonicalPath() + "Канонічний шлях до файлу");
            System.out.println(child.getAbsolutePath() + "Абсолютний шлях до файлу");
            System.out.println(child.createNewFile());
            writeSampleDataToFile(child);
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
            System.out.println("Зчитування файла за допомогою стріму");
            System.out.println(readFromInputStream(inputStreamWithResources));
        }catch (IOException e){
            throw new RuntimeException();
        }

        System.out.println("Читання за допомогою NIO та Буферу");


        Path path = Paths.get("filesDir/HomeWork26.txt");

        try (BufferedReader reader = Files.newBufferedReader(path);){
            byte[] bytes = Files.readAllBytes(path);

            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("ДатаЧас створення файлу: " + attrs.creationTime());
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("DirectoryStream");
        Path folderPath = Paths.get("filesDir");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folderPath)) {
            for (Path file : directoryStream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("NIO Files method");
            Stream<String> lines = Files.lines(path);
            String data = lines.collect(Collectors.joining("\n"));
            lines.close();
            System.out.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static File makeDir(String name) {
        File directory = new File(name);

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
        System.out.println("Запис в файл");
        try (FileOutputStream out = new FileOutputStream(sample)) {
            for (int i = 1; i <= 5; i++) {
                String text = "HomeWork26 writing " + i + " line \n";
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


