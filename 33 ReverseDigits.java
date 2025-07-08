// create a program to reverse the digits of a number

import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Reverse the digits");
        System.out.print("Please enter your number");
        int num = s.nextInt();
        int reverseDigits = reverseDigits(num);
        System.out.println("Reverse of your number is " + reverseDigits);

    }

    public static int reverseDigits (int num){
        int newNum = 0;
        while (num>0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num/= 10;
        }
        return newNum;
    }
}
