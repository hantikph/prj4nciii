package assignments1;

import java.util.Scanner;

public class NumberChecker {
    static long numToCheck;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check: ");

        try {
            numToCheck = input.nextLong();
            String res = (numToCheck>0)? "positive": "negative";

            long result = Math.abs(numToCheck % 2);

            if (numToCheck != 0L && result == 0L) {
                System.out.println("Number is even and "+ res);
            } else if (result != 0L) {
                    System.out.println("Number is odd and "+ res);
            } else {
                System.out.println("The number is 0");
            }
        } catch (RuntimeException e) {
            System.out.println("invalid input");

        }
    }
}
