package Sixth;

//Створити програму для виведення чисел від 1 до 10
//Показати всі парні числа в діапазоні від 1 до 100
//Знайти факторіал числа 7
//Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)

public class SixthHomework {

    public static void main(String[] args) {
        {

            System.out.println("Розрахунок слоненяток від 1 до 10");
            for (int i = 0; i <= 10; i++) {
                System.out.println("Слоненятко " + i);
            }
            System.out.println("Розрахунок закінчено");
        }

        //Показати всі парні числа в діапазоні від 1 до 100
        {
            System.out.println("Парні числа:");
            int j = 2;
            do {
                System.out.println(j);
                j += 2;
            } while (j <= 100);
        }

        //Знайти факторіал числа 7
        {
            System.out.println("Факторіл");
            int f, fact = 1;
            int number = 7;
            for (f = 1; f <= number; f++) {
                fact = fact * f;
                System.out.println("Число " + f + " = Факторіал " + fact);
            }
            System.out.println("Фасторіал числа " + number + " = " + fact);
        }
//Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        {
            System.out.println("Число фібоначі");
            int a = 0;
            int b = 0;
            int fib = 1;
            do {
                a = b;
                b = fib;
                System.out.println(a + " , " + b + " fib " + fib);
                fib = a+b;
            }
                while (fib < 100);
        }
        }
    }