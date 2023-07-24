package EightArrays;

import java.util.Arrays;

public class Additional {

    public static void main(String[] args) {
        seasons1();
        twoDim();
        chessBoard();

    }
    //Способи ініціалізації масивів
//    №	Объявление массива, Java-синтаксис	Примеры	Комментарий
//1.  dataType[] arrayName;
//    Приклади:
//    int[] myArray;
//    Object[]
//    arrayOfObjects;
//    Желательно объявлять массив именно таким способом, это Java-стиль

//2. dataType arrayName[];
//   Приклади:
//   int myArray[];
//   Object
//   arrayOfObjects[];
//   Унаследованный от С/С++ способ объявления массивов, который работает и в Java


    // Перший варіант ініціалізації масиву
    public static void seasons1() {
        System.out.println("Array seasons1");
        String[] seasons = new String[4]; /* объявили и создали массив. Java выделила память под массив из 4 строк, и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)*/
        seasons[0] = "Winter"; /* в первую ячейку, то есть, в ячейку с нулевым номером мы записали строку Winter. Тут мы получаем доступ к нулевому элементу массива и записываем туда конкретное значение  */
        seasons[1] = "Spring"; // проделываем ту же процедуру с ячейкой номер 1 (второй)
        seasons[2] = "Summer"; // ...номер 2
        seasons[3] = "Autumn"; // и с последней, номер 3

        System.out.println(Arrays.toString(seasons)); //
        System.out.println("Відображення за допомогою класу Array, які імпортували"); //

        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println("Відображення даних в циклі");

        System.out.println("Array seasons2");
        String[] seasons2 = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons2[i]);
        }
    }

// Двомірний масив



    public static void twoDim() {
        System.out.println("Двомірні масиви");
        System.out.println("Другий варіант ініціалізації двомірного масиву");
        int[][] twoDimArray  = new int [8][8];

        twoDimArray[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        twoDimArray[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

        for (int i = 0; i < 3; i++) {  //йдемо рядками
            for (int j = 0; j < 4; j++) {  //йдемо стовпчиками
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенесення рядку для візуального збереження структури
        }
        System.out.println("Завершення виведення першого варіанту ініціалізації двомірного масиву")
        ;

        System.out.println("Другий варіант ініціалізації двомірного масиву");
        int [][] twoDimArray2 = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        for (int i = 0; i < 3; i++) {  //йдемо рядками
            for (int j = 0; j < 4; j++) {//йдемо стовпчиками
                System.out.print(" " + twoDimArray2[i][j] + " "); //виведення елементу з маису
            }
            System.out.println();//перенесення рядку для візуального збереження структури
        }
        System.out.println("Завершення виведення другого варіанту ініціалізації двомірного масиву");
    }

    public static void chessBoard() {
        System.out.println("Шахматна дошка");
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j =0; j < chessBoard[0].length; j++) {
                if ((i+j)%2==0) chessBoard[i][j] = "W" + chessBoardCoord(j,i);
                else chessBoard[i][j] = "B" + chessBoardCoord(j,i);
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Шахматна дошка вище");
    }



    @org.jetbrains.annotations.Nullable
    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b)); /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
    }








}
