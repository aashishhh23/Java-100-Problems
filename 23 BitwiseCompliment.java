// Create a program that shows bitwise compliments of a number

import java.util.Scanner;

class BitwiseCompliment {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to showcase of Not/ Compliment Operator\n");
         System.out.print("Enter a number: ");
         int num = input.nextInt();

         int result = ~num;
         System.out.println("Yor result is: " + result);

     }
}
