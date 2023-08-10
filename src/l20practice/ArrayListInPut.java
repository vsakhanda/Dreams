package l20practice;

/*
Напишіть програму - яка зчитує слово з консолі, працює до тих пір поки користувач не введе слово No, якщо
        користувач вводить слово Yes - програма питає у нього слово - яке б додавало до арай лісту,
        коли користувач - вводить слово No - програма виводить ліст на екран і завершує роботу

        додатково - через те що це ліст, додати перевірку перед додаванням чи додається таке саме слово - якщо так
        то вивести на екран наступне - ви ввели слово яке вже додано, введіть будь-ласка інше
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListInPut {

    private static List<String> words = new ArrayList<>();

    public void array(){

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Виберіть одне з двох значень yes чи no");
            String answer = scanner.nextLine().toLowerCase();
            if(answer.equals("no")) {
                break;
            } else if (answer.equals("yes")){
                System.out.println("Please entre your word: ");
                String word = scanner.nextLine().toLowerCase();
                if (words.contains(word)){
                    System.out.println("Choose another one");
                } else {
                    words.add(word);
                }
            } else {
                System.out.println("Invalid input. Please entre yes or no");
            }
        }
        System.out.println(words);

        scanner.close();
    }
}