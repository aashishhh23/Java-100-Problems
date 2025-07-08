//Arithmetic Exception Handling
// Write a program that asks user to enter two integers and then divides the first by the second.
// The Program should handle any arithmetic exceptions that may occur (like divison by zero) and
// display an appropriate message.
// Key Points
// 1] Use Scanner to read input
// 2] Implement a try-catch block to handle ArithmeticException
// 3] Display a user-friendly message if division by zero occurs


package com.aashish.challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.print("Enter first number");
        int first = input.nextInt();
        System.out.print("Now, Enter second number");
        int second= input.nextInt();

        try {
            int result =first / second;
            System.out.printf("Result is %d",result);
        }catch (ArithmeticException exception){
            if (exception.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero occured");
            } else {
                throw exception;
            }
        }
    }
}
