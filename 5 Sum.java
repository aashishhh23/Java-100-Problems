// Create a program to add two numbers.

import java.util.Scanner;

class Sum5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print(" Enter second number: ");
        int secondNum = input.nextInt();

        int sum = firstNum +secondNum;

        System.out.println(" Sum of two numbers is:  " + sum);



    }
}
