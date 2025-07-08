// Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers

import java.util.Scanner;

class SumPositive {
    public static void main(String[] args) {

        System.out.println("Welcome to Adding positive numbers. ");
        int[] numArr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;

        }
        System.out.println("The sum of positive number is: "+ sum);
    }
}
