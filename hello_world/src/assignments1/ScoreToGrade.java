package assignments1;

import java.util.Scanner;

public class ScoreToGrade {
    static int score;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student score to consider: ");

        score = input.nextInt();
        if (score >= 90) {
            System.out.println("Score of "+score+" gets a grade of \"A\".");
        } else if (score >= 80) {
            System.out.println("Score of "+score+" gets a grade of \"B\".");
        } else if (score >= 70) {
            System.out.println("Score of "+score+" gets a grade of \"C\".");
        } else if (score >= 60) {
            System.out.println("Score of "+score+" gets a grade of \"D\".");
        } else {
            System.out.println("The score has a failing grade of \"F\".");
        }
    }
}
