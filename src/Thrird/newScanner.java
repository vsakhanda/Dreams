package Thrird;

import java.util.Scanner;
//new

public class newScanner {

    public static void main(String[] args)
    {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter user name");

        String userName = myObj.nextLine();
        System.out.println ("Username is "+ userName);

    }

}
