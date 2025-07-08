// CREATE a program that determines the greatest of the 3 numbers

import java.util.Scanner;

class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest No. identifier:  \n");
        System.out.print("Please enter first number: ");
        int first = input.nextInt();

        System.out.print("Now, Enter your second number: ");
        int second = input.nextInt();

        System.out.print("Now,Enter your third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) { // short circuit operator
            System.out.println(first + "is the greatest number");
        } else if ( second >= third) {
            System.out.println(second + "is the greatest number");

        }else {
            System.out.println(third + " is the greatest number");
        }

    }


}
