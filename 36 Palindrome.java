import java.util.Scanner;

import static java.lang.Integer.reverse;

// Create a program to verify if a number is palindrome
class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Palindrome number");
        System.out.print("Enter Your Number");
        int num = s.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is a palindrome number");
        } else {
            System.out.println("Your number is not a palindrome number");
        }

    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
        int digit = num % 10;
        newNum = newNum * 10 + digit;
        num /= 10;
    }
    return newNum;
}


}
