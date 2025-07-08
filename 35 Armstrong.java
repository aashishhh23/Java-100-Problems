// create a program to check if a number is an Armstrong number

import java.util.Scanner;

import static java.lang.Math.pow;

class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.print("Please Enter your number");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        }else {
            System.out.println("Your no.is not Armstrong");
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num >0) {
            int lastdigit = num % 10;
            num /= 10;

            finalNumber += pow(lastdigit, noOfDigits);
        }

        return finalNumber == numCopy;
    }
public static int  power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }

        return result;
}
    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }

return digits;
    }
}
