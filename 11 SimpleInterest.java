//create a program to calculate simple interest
// formula = (P*T*R)/100

import java.util.Scanner;

class SimpleInterest {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Welcome to simple interest Calculator\n");
   System.out.println("Please enter your principle amount"); // take input

   int principle = input.nextInt();
   System.out.println("now tell me your rate of interest");
   float rate = input.nextFloat();
   System.out.println("Now, tell me for how many years are you borrowing this");
   float years =input.nextFloat();

   float interest = (principle * rate * years) / 100;
   System.out.println("\n\n your simple interest is Rs: "+ interest);



  }


}
