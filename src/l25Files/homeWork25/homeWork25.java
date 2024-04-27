package l25Files.homeWork25;

//Створити класс з 2 функціями. Перша зберігає отриману строку у файл. Друга - зчитує дані з файлу та повертає його користувачу


// + Буфризація
// + Серелізація/Десерелізація
// + Папки та місця збереження.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class homeWork25 {

    public static void main(String[] args) {
            File file = new File("HomeWork.txt");
            if (file.exists()) {
                reader(file);
            } else {
                writer(file, "Odyssey's HomeWork");
            }
    }

    // Write function
    public static void writer (File fileHome, String contentFile){
        try (FileWriter fileWriter = new FileWriter(fileHome)) {
            fileWriter.write(contentFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    // Read function
    public static void reader(File fileMine){
        StringBuilder stringBuilder = new StringBuilder(); // Створення StringBuilder дл опису нового об'єкту
        try (FileReader fileReader = new FileReader(fileMine)) { // Обгортка try catch
            int ch;                                                // Специфіка байтів. Змінна ch
            while(  (ch = fileReader.read()) != -1) {               // Виконувати читання поки read не поверне -1 - специфіка реалізації.
                stringBuilder.append((char) ch);                    // Перетворення в дата-тип. char трансформує дані юнікод в символ.
            }
        }catch (IOException e){ // Опис виключення
            e.printStackTrace();
        }
    }
}





