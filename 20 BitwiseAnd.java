import java.util.Scanner;

// Create a program that shows bitwise AND of two numbers
class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator\n");
        System.out.print("Please enter the first number");
        int first = input.nextInt();
        System.out.println("now, enter second number");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("result is : " + result);
    }
}
