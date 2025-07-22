package assignments1;

import java.util.Scanner;

public class MultiplicationTable {
    // generates a multiplication table of up to 15
    public static void main(String[] args) {
        int tableSize;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiplication table size (10 to 17):");

        tableSize = input.nextInt();
        try {
            if(tableSize <= 17 && tableSize >= 10) {
                for(int i=1; i<=tableSize; i++) {
                    for(int j=1; j<=tableSize; j++)
                        System.out.print(i*j +"\t");
                    System.out.println();
                }
            } else {
                System.out.println("Choose a number from 10 to 17");
            }
        } catch (Exception e) {
            System.out.println("invalid input");
        }

    }
}
