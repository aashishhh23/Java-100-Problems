// create a program that calculates grades based on the ranks

import java.util.Scanner;

class CalculateGrades {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Grade Calculator\n");
         System.out.print("Please enter your percentage");
         float percentage = input.nextFloat();

         if (percentage >= 90) {
             System.out.println("Yo have got A");
         } else if (percentage >= 75) {
             System.out.println("You have got B");

         } else if (percentage >= 60) {
             System.out.println("You have got C, work harder next time");
         } else if (percentage >=30){
             System.out.println("You have got D, you seriously need to work harder");
         } else {
             System.out.println("OOps ! You have failed the test and got Failed");
         }
     }
}
