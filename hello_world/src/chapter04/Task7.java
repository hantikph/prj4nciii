package chapter04;

import java.util.*;

public class Task7 {
    // methods
    public int addNums(int num1, int num2) {
        return num1 + num2;
    }
    public int subtractNums(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplyNums(int num1, int num2) {
        return num1 * num2;
    }
    public float divideNums(int num1, int num2) {

        return (float)num1 / (float)num2;
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

        Task7 test = new Task7();
            System.out.println("Adding "+x+" and "+y+" makes "+test.addNums(
                x, y));
        System.out.println("Subtracting "+x+" and "+y+" makes "+test.subtractNums(
                x, y));
        System.out.println("Multiplying "+x+" to "+y+" makes "+test.multiplyNums(
                x, y));
        System.out.println("Dividing "+x+" by "+y+" makes "+test.divideNums(
                x, y));
    }
}
