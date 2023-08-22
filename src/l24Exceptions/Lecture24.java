package l24Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Lecture24 {

    public static void main (String[] args) {




        try { // try body
            // any code that you need
            int result = 10 / 0;
        } catch (ArithmeticException e) {// exception description
            System.out.println("Division by zero error - Check arguments"); // exception method
        }


        // Checked Exceptions - виключення з обов'язковим обгортанням в блок try catch

        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) { // Обов'язково потрібно додати блок try catch  - вимога Java
            //    e.printStackTrace();
            System.out.println("Hello" + e);
        }


        // Unchecked Exceptions - виключення, які НЕ обов'язковим обгортанням в блок try catch
        int y = 0;
        try {
            int x = 2;
            y = 10 / x;
            System.out.println("result" + y);
            // exception description
        } catch (ArithmeticException e) {
            System.out.println("X equels 0");
        } finally {
            // System.out.println(y);
        }

/*
     Block finally
     Призначення: виконання коду не залежно від того, чи виник виняток.
     */

        try {
            // any code
        } catch (Exception e) {
            // handler exception
        } finally {
            // always executed;
        }

            // With Stream
            List<String> stringList = new ArrayList<>();
            stringList.add("Kesha");

            try {
                stringList.stream().filter(name -> Objects.equals(name, "Vasyl")).findFirst().orElseThrow(() -> new CustomException("text massage", 401));
            } catch (CustomException e) {
                System.out.println("Exception was catch " + e);
            } finally {
                System.out.println("Finally code which always will run");
            }



            // Autocloseble interfaces
            // old realization
/*
            Scanner scanner1 = null;
            try {
                scanner1 = new Scanner(new File("text.txt"));
                while (scanner1.hasNext()) {
                    System.out.println(scanner1.nextLine());
                }
            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            } finally {
                if (scanner1 != null) {
                    scanner1.close();             // need to close some methods manualy
                }
            }

            // new realization

            try (Scanner scanner = new Scanner(new File("text.txt"))) // methods whitc extends from Autocloseble or Closeble interfaces)
            {
                while (scanner.hasNext()) { // main methods
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            }
        }*/

        practiceOne(4, 1);
        practiceTwo();


    }
            //Одночасна обробка: Обробка декількох винятків в одному блоку catch
        public static void together() {
            try {
                String pathname = null; // Це спричинить NullPointerException
                File file = new File(pathname);
                Scanner scanner = new Scanner(file);
                String numberString = scanner.nextLine();
                int number = Integer.parseInt(numberString); // Це може спричинити NumberFormatException
                System.out.println("Read and parsed number: " + number);
            } catch (FileNotFoundException | NumberFormatException | NullPointerException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

                try {
                    String pathname = null; // Це може спричинити NullPointerException
                    File file = new File(pathname);
                    Scanner scanner = new Scanner(file);
                    String numberString = scanner.nextLine();
                    int number = Integer.parseInt(numberString); // Це може спричинити NumberFormatException
                    System.out.println("Read and parsed number: " + number);
                } catch (NullPointerException e) {
                    System.out.println("Pathname was null: " + e.getMessage());
                } catch (FileNotFoundException e) {
                    System.out.println("File not found: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Could not parse number: " + e.getMessage());
                }
        }

     // Practice


    //Обробка NullPointerException та ArithmeticException
    /*
     Напишіть функцію, яка ділить два числа. Якщо чисельник або знаменник дорівнює null,
     виведіть "Помилка: null значення". Якщо знаменник дорівнює 0, виведіть "Помилка: ділення на нуль".
     */

    /*
       Напишіть програму, що запитує у користувача два числа з консолі та ділить їх.
       Використайте блок finally, щоб закрити об'єкт Scanner незалежно від виникнення винятків.
     */


    public static void practiceOne (int a, int b){
        try {
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e) {// exception description
            System.out.println("b equals to zero"); // exception method
        } catch (NullPointerException npe) {// exception description
            System.out.println("null argument"); // exception method
        }
    }


    public static void practiceTwo (){

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Внесіть число для ділення : ");
            int a = scanner.nextInt();
            System.out.println("Внесіть число на яке необхідно виконати ділення : ");
            int b = scanner.nextInt();
            System.out.println(a/b);
        } catch (ArithmeticException e) {// exception description
            System.out.println("ділення на нуль"); // exception method
        } catch (NullPointerException npe) {// exception description
            System.out.println("null argument " + npe); // exception method
        } catch (InputMismatchException ime) {// exception description
            System.out.println("null input problems" + ime); // exception method
        }finally {
            if (scanner != null) {
                scanner.close();             // need to close some methods manualy
            }
        }
    }


}
