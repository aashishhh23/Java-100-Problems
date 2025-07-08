// Create a program to find the Greatest Common Multiple (LCM) of two numbers

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to LCM Finder");
        System.out.print("Please enter your first number");
        int first = scanner.nextInt();

        System.out.print("Please enter your second number");
        int second = scanner.nextInt();


        int lcm = lcm(first, second);
        System.out.println("LCM of 2 Numbers is: " + lcm);
    }
    public static int lcm(int first, int second){
        int i =1;
        while (true) {
       int factor = first * i;
       if (factor % second == 0) {
           return factor;
       }
            i++;
        }


    }

}
