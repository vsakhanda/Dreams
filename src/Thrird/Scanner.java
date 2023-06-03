package Thrird;

/**
 *  Example of use scanner in java. It made input of objects in console ad use them in program work.
 *
 */
import java.util.Scanner;


public class Scanner {

    public static void main(String[] args)
    {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter user name");

        String userName = myObj.nextline();
        System.out.println ("Username is "+ userName);

    }

}
