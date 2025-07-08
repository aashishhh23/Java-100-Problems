// create a program to find the minimum of two numbers

import java.util.Scanner;

class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Find Minimum Of two number\n");
        System.out.print("Please enter your first number");
        int num1 =input.nextInt();

        System.out.print("Enter your second number");
        int num2 = input.nextInt();

        // we cant call method because we are in static context
        // therefore we have to make object of the class

        MinimumTernary ternary= new MinimumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum no. is: " + min);
    }
    public int min(int num1, int num2) {
        // use ternary

        return  num1 < num2 ? num1 : num2;

        // OR

//        if (num1 < num2) {
//            return num1;
//        } else {
//            return num2;
//        }

    }

}
