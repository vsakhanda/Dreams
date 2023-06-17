package Sixth;

// Метод, що дозволяє без тіла отримати середнє значення
public class AdditionalSixLecture {

    public static void main(String[] args) {

        median();
        medianWithBody();
        tik();
        table();
        power();
    }


    public static void median() {
        int i = 101;
        int j = 251;        // знайти середину між i и j
        System.out.println("Різниця між значеннями "  + (j-i) );
        System.out.println("Сума значень "  + (j+i) );
        System.out.println("Середнє значення "  + (j+i)/2 );
        while (++i < --j)
            ; // цикл без тіла
        System.out.println("Середина діапазону: " + i);
        System.out.println("Різниця між значеннями  " + (j-i) );
    }

    public static void medianWithBody() {
        int i = 101;
        int j = 251;        // знайти середину між i и j
        System.out.println("Різниця між значеннями "  + (j-i) );
        System.out.println("Сума значень "  + (j+i) );
        System.out.println("Середнє значення "  + (j+i)/2 );
        while (++i < --j)
        {
            System.out.println("Знаячення підбору " + j +  " та "+ i + " ділення " + ((j+i)/2));
        }
         // з тіломб якщо після виразу додавати тіло, воно буде відображати кожен крок розрахунку
        System.out.println("Середина діапазону: " + i);
        System.out.println("Різниця між значеннями  " + (j-i) );
    }

    public static void tik() {
        int n = 10;
        while (n > 0) {
            System.out.println("Тик " + n--);
        }

    }



    private static void table() {
        // Табличка множення
        System.out.println("Табличка множення");
        int t = 3;
        for (int i =1; i<=10; i++) {
         System.out.println(t + " * "+ i + " = " + t*i );
        }
        System.out.println("Завершення розрахунку");
    }

// Приведення до степеня

    private static void power() {
        // Табличка множення
        System.out.println("Приведення до степеня");
        int num = 3;
        int p = 10;
        for (int i =1; i<=p; i++) {
            System.out.println("Число "+ num + " в степені "+  i + " дорівнює = " + (Math.pow(num, i)) );
        }
        System.out.println("Завершення розрахунку");
    }



}