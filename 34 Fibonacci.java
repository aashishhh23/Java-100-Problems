// create a program to print the Fibonacci series upto a certain number

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Please Enter the number upto which series has to be printed");
        int num = s.nextInt();
        System.out.println("Here is the Fibonacci series");
        printFibonacci(num);



    }
    public static void printFibonacci(int num) { // void islea aya qki return nhi krna h

        if (num< 0)return;
        System.out.println("0 ");

        if (num == 0) return;
        System.out.println("1 ");

        int first =0, second = 1; //agr multiple variables same data type ke declare krne h to ek line m [,] lgakr kr skte h
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }
    }
}
