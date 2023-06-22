package Eight;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        // Введення даних про дві матриці
        System.out.println("start");

        int[][] twoDimArray1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] twoDimArray2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        // відображення інформації про початкові матриці
        System.out.println(Arrays.deepToString(twoDimArray1));  //Матриця 1
        System.out.println(Arrays.deepToString(twoDimArray2));  //Матриця 2
        // відображення інформації про початкові матриці методом проходу по рядкам
// Матриця 1
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print(" " + twoDimArray1[i][j] + " "); //відображення занчень матриці
            }
            System.out.println(" Matrix 1"); //Завершення рядку
        }
// Матриця 2
        for (int i = 0; i<twoDimArray2.length; i++) {
            for (int j=0; j<twoDimArray2[1].length; j++) {
                System.out.print(" " + twoDimArray2[i][j] + " "); //відображення занчень матриці
            }
            System.out.println(" Matrix 2"); //Завершення рядку

        }
        System.out.println(twoDimArray2.length);
        System.out.println(twoDimArray2[1].length);



        //процес множення матриць
        int[][]twoDimArray3 = new int [twoDimArray1.length][twoDimArray2[0].length];
        for (int i=0; i<twoDimArray3[0].length; i++)
            for (int j=0; j<twoDimArray3.length; j++)
                for (int k=0; k<twoDimArray1[0].length; k++)
                    twoDimArray3[i][j] = twoDimArray3[i][j] + twoDimArray1[i][k]*twoDimArray2[k][j];


//відображення результату на екрані
        for (int i = 0; i < twoDimArray3.length; i++) {
            for (int j = 0; j < twoDimArray3[0].length; j++) {
                System.out.print(" " + twoDimArray3[i][j] + " ");
            }
            System.out.println(" Результат множення");
        }
    }
}
