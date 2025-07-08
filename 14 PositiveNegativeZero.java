//  CREATE A PROGRAM THAT DETERMINES IF A NUMBER IS POSITIVE,NEGATIVE, OR ZERO

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number identifier\n\n");
        System.out.print("Please Enter your Number");

        //take integer from user

        int num = input.nextInt();


        if (num > 0) {
            System.out.println("your no. is positive");

        } else if (num == 0) {

            System.out.println("your no. is zero");
        } else {
            System.out.println("Your no. is negative");

        }
    }
}
