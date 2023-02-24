package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The great software to predict  your future");
        System.out.println("Type your question and The Software will answer yes or no");
        String pergunta = input.nextLine();
        //if you put a space at the beginning of the question the answer will be YES
        if (pergunta.charAt(0)== ' '){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
