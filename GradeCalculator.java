// 2022 ESTU BIM101 Programming Assignment 1 - FURKAN KOZMAÇ
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome. Please enter the overall score of your exam: ");
        double score = input.nextDouble();
        if (0 <= score && score <= 100) {
            if (90 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: AA" + "\nState: Passed ");
            } else if (85 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: AB" + "\nState: Passed");
            } else if (80 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: BA" + "\nState: Passed");
            } else if (75 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: BB" + "\nState: Passed");
            } else if (70 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: CB" + "\nState: Passed");
            } else if (65 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: CC" + "\nState: Passed");
            } else if (60 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: DC" + "\nState: Passed");
            } else if (50 <= score) {
                System.out.println("Your overall score is: " + score + "\nYour grade is: DD" + "\nState: Passed");
            } else {
                System.out.println("Your overall score is: " + score + "\nYour grade is: FF" + "\nState: Failed");
            }
        } else {
            System.out.println("Please enter valid overall score.");
        }
    }
}