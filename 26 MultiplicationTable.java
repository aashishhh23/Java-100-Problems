// Develop a program that prints the multiplication table for a given numbers

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World\n");
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
    }
    //create function of main logic
    public static void printMultiplicationTable(int num) {
        int i =1; // first step is initialisation
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }

    }
}


