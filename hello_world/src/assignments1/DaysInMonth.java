package assignments1;

import java.util.Scanner;

public class DaysInMonth {
    static int month;

    public static void main(String[] args) {

        Scanner numberToConvert = new Scanner(System.in);
        System.out.println("Enter a month in numerals (1 - 12): ");

        month = numberToConvert.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.print("31 days.");
                break;
            case 2:
                System.out.print("February normally has 28 days.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.print("30 days.");
                break;
            default:
                System.out.println("Not a valid month number.");
                break;

        }

    }
}
