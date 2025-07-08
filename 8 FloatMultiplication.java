// Create a program to calculate product of 2 floating point numbers

import java.util.Scanner;

class FloatMultiplication8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Floating Multiplication\n\n");
        System.out.print("Please Enter first decimal number: ");
        float first = input.nextFloat();
        System.out.print("Enter second number: ");
        float second = input.nextFloat();

        float product = first * second;

        System.out.println("Product is: " +(product));

    }


}
