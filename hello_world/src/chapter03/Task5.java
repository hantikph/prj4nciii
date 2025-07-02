package chapter03;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        numList.add(input.nextInt());
        System.out.println("Enter the second number:");
        numList.add(input.nextInt());
        System.out.println("Enter the last number:");
        numList.add(input.nextInt());

        Collections.sort(numList);

        String message = ((numList.get(0).equals(numList.get(1))) && (numList.get(1).equals(numList.get(2))))
                ? "All numbers are equal"
                : "The highest number is " + numList.get(2);
        System.out.println(message);


    }
}
