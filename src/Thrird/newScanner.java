package Thrird;

import java.util.Scanner;
//new

public class newScanner {

    public static void main(String[] args)
    {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = myObj.nextLine();
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter surname");
        String surname = myObj2.nextLine();
        System.out.println ("Username is "+ userName);
        System.out.println ("Surname is "+ surname);

    }

}
