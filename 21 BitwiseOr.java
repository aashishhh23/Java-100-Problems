import java.util.Scanner;

// Create a program that shows bitwise OR of two numbers
class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Or operator\n");
        System.out.print("Please enter the first number");
        int first = input.nextInt();
        System.out.println("now, enter second number");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("result is : " + result);
    }
}
