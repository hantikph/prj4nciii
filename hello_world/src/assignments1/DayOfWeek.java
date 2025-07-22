package assignments1;

import java.util.Scanner;

public class DayOfWeek {
    static int dayNum;

    public static void main(String[] args) {

        Scanner numberToConvert = new Scanner(System.in);
        System.out.println("Enter a day in numerals (1 - 7): ");
        try {
            dayNum = numberToConvert.nextInt();

            switch (dayNum) {
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("TGIFriday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
                case 7:
                    System.out.print("Sunday");
                    break;
                default:
                    System.out.println("Not a valid day number.");
                    break;
            }
        } catch (RuntimeException e) {
            System.out.println("invalid input");
        }

    }
}
