//Create a program that computes the sum of the digits
// 236 =2+3+6
// Concept = Modulus
// Walmart Interview

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sum Of Digits");
        System.out.print("Please enter the number");
        int num = scanner.nextInt();

        int sum =sumOfDigits(num);
        System.out.println("Sum of Digits is: " + sum);

    }

    // make a function
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num>0) {
            sum +=  num % 10;
//            num = num/10; OR
            num /= 10;
        }
        return sum;
    }
}
