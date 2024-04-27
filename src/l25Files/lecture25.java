package l25Files;

import java.io.*;

public class lecture25 {

    public static void main(String[] args){

    // simpleReadWrite();
    // readerWriter();
// Буферизація дочитати допрацювати

    }
    private static void readerWriter(){
        File file = new File("reader.txt");
        if (file.exists()) {
            readFile(file);
        } else {
            writeToFile(file, "test. test. test Odyssey second edition");
        }
    }

    private static void writeToFile(File fileMine, String content) {
        try (FileWriter fileWriter = new FileWriter(fileMine)) {
            fileWriter.write(content);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readFile(File fileMine) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileMine)) {
            int ch;
            while(  (ch = fileReader.read()) != -1) {
                stringBuilder.append((char) ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }



    public static void simpleReadWrite() {

        File fileMine = new File( "text.txt");
        if(!fileMine.exists()) {
            try {
                fileMine.createNewFile();
                writeToFile("text.txt", "test test test Odyssey is winner!");
                // write to file
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String content = readFile("text.txt");
        System.out.println(content);
    }


    private static void writeToFile(String filePath, String content) {
        try(OutputStream outputStream = new FileOutputStream(filePath, false)){
            byte [] bytes = content.getBytes();
            outputStream.write(bytes);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath){

        StringBuilder content = new StringBuilder();

        try(InputStream inputStream = new FileInputStream(filePath)) {
            int ch;
            while(  (ch = inputStream.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}
