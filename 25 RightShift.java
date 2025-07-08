 // Create a program that shows use of Right shift operator

 import java.util.Scanner;

 class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Right Shift Operator\n");
        System.out.print("Please enter your number");
        int num = input.nextInt();

        int result = num >> 4; // for division of something
        System.out.println("Your result is: " + result);
    }
}
