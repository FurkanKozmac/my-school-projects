// ESTU BIM101 COMPUTER PROGRAMMING I Assignment 3 - Furkan KOZMAÇ

import java.util.Scanner;

public class OddCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome. Please enter two values:");

        int value1 = input.nextInt();
        int value2 = input.nextInt();

        // For loop method
        int run = 0;
        for (int i = value1; i <= value2; i++) {
            if (i % 2 != 0) {
                run++;
            }
        };

        // Mathematical method
        int oddValues = 0;
        if (value1 % 2 == 0 && value2 % 2 == 0) {
            oddValues = ((value2 - 1) - (value1 - 1)) / 2 + 1;
        } else if (value1 % 2 == 0 && value2 % 2 != 0) {
            oddValues = ((value2 - 1) - (value1 + 1)) / 2 + 1;
        } else if (value1 % 2 != 0 && value2 % 2 != 0) {
            oddValues = ((value2 + 1) - (value1 + 1)) / 2 + 1;
        } else {
            oddValues = (value2 - value1) / 2 + 1;
        };

        System.out.println("Odd values with for loop method : " + run);
        System.out.println("Odd values with mathematical method : " + oddValues);

    }
}
