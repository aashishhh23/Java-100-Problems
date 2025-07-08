import java.util.Scanner;

// Create a program that shows bitwise Xor of two numbers
class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Xor operator\n");
        System.out.print("Please enter the first number");
        int first = input.nextInt();
        System.out.println("now, enter second number");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("result is : " + result);
    }
}
