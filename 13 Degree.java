//  CREATE A PROGRAM TO CONVERT FAHRENHEIT TO CELSIUS
// C =(F-32) *5/9

import java.util.Scanner;

class Degree {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Welcome to Fahrenheit to Celsius Converter \n");
         System.out.print("Please Enter your temp in F: ");
         //now take input
         float Fahrenheit =  input.nextFloat();
         float Celsius = (Fahrenheit - 32) * 5 / 9;
         System.out.println("Your Temperature is: " + Celsius + "c");


     }
}
