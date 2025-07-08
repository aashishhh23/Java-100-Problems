// create a program to check whether a given number is prime

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Welcome to Prime");
        System.out.print("Enter your number");
        int num = s.nextInt();

        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("your number is prime");
        }else {
            System.out.println("Your number is not prime");
        }
    }

    // create a method
    public static boolean isPrime(int num) {
        int i =2 ;
        while (i <num) {
            if (num % i == 0) {
                return false;
            }
            i++;

        }

        return true;
    }
}
