// Create a program that determines if a number is odd or even

import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/ even identifier\n");
        System.out.println("Please enter your number: ");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your no. is an even no.");
        } else {
            System.out.println("Your no. is an odd no.");
        }
    }

}
