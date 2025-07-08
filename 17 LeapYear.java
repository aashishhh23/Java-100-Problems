// Create a program that determines if a given year is a leap year
// [considering conditions like divisible by 4 but not 100, unless also divisible by 400]

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap year calculator \n");
        System.out.println("Please enter Year");
        int year = input.nextInt();

//        if (year % 400 == 0) {
//            System.out.println("This is a leap year");
//
//        } else if (year % 4 == 0 && year % 100 !=0) {
//            System.out.println("This is leap year");
//
//        } else {
//            System.out.println("This is not a leap year");
//    }
//    }
//}

        // this is or-or (||) this say that if any condition is true then u will be enter deep
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
            System.out.println("This is a leap year");

        } else {
            System.out.println("This is not a leap year");
        }
    }
}
