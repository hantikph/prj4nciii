package chapter04;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task9 {
    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }
    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }
    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }
    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        nums.add(input.nextInt());
        System.out.println("Enter the second number: ");
        nums.add(input.nextInt());

        int x = nums.get(0);
        int y = nums.get(1);

        Task9 test = new Task9();
        System.out.println(x+" + "+y+" = "+test.add(x, y));
        System.out.println(x+" + "+y+" = "+test.subtract(x, y));
        System.out.println(x+" + "+y+" = "+test.multiply(x, y));
        System.out.println(x+" + "+y+" = "+test.divide(x, y));
    }
}
