// Create a program to calculate Perimeter of a Rectangle.

import java.util.Scanner;

 class Perimeter {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("Calculator for Measure perimeter of a rectangle\n");
//        System.out.print("Enter side A: ");
//        int first = input.nextInt();
//
//        System.out.print("Enter side B: ");
//        int second = input.nextInt();
//
//        System.out.print("Enter side C: ");
//        int third = input.nextInt();
//
//        System.out.print("Enter side D: ");
//        int fourth = input.nextInt();
//
//        int sum = first + second +third + fourth;
//
//        System.out.println("Perimeter of rectangle is: "+ (sum));



        //                                 OR

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Perimeter Calculator\n\n");
        System.out.println("Please enter all 4 sides in cms");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter =a + b + c + d;
        System.out.println("Perimeter of your rectangle is: "+ perimeter + "cm");
    }
}
