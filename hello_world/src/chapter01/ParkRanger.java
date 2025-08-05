package chapter01;

import java.sql.SQLOutput;

public class ParkRanger {
    int birds = 0;

    public static void main(String[] data) {
        int trees = 5;
        int birds = 0;
        System.out.println(trees+birds);

        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
        }
    }
}
