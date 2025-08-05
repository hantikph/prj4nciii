package assignments1;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter text string:");
        String stringInput = inputString.nextLine();
        // check the String methods
        System.out.println(stringInput +" is "+ stringInput.length() +" long.");
        System.out.println(stringInput.toUpperCase() +" .toUpperCase()");
        System.out.println(stringInput.toLowerCase()+" .toLowerCase()");
        System.out.println(stringInput.charAt(0) +" is the first character .charAt(0)");
        System.out.println(stringInput.charAt(stringInput.length()-1) +" is the last character .charAt(x.length()-1)");
        System.out.println(stringInput.substring(1, 5)+ " is the .substring(from second, to fifth) characters.");
        //StringBuilder strToCheck = new StringBuilder(stringInput);
        // StringBuilder Methods
    }
}
