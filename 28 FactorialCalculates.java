// Write a function that calculates the factorial of a given number

// Important

import java.util.Scanner;

class FactorialCalculates {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num); // data type
        System.out.println("Factorial is  " + fact);
    }

    // now let's make a function
    public static long  factorial (int num) { // here return is factorial that's why we have to make data type
        if (num < 2) {
            return 1; // return lagane se method whi pr end ho jata h
        }
        long fact = 1;
        int i = 2;
        while (i <=num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
