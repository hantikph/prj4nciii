package chapter03;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter words to check:");

        String wordsToCheck = inputString.nextLine();
        StringBuilder strBuilder = new StringBuilder(wordsToCheck);
        String reverseString = strBuilder.reverse().toString();
        System.out.println(wordsToCheck+", rev: "+reverseString);
        if (reverseString.equals(wordsToCheck)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
