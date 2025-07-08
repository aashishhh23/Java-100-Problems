import java.util.Scanner;

// Create a program that Categorize a person into different age groups
class CategorizeAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Calculator");
        System.out.print("Please, Enter your age: \n");
        int age = input.nextInt();

        if(age >= 65) {
            System.out.println("You are a Senior Citizen");
        } else if (age >= 20) {
            System.out.println("You are an Adult");
        } else if (age >= 13) {
            System.out.println("You are a Teenager ");

        } else {
            System.out.println("You are a child");
        }
    }
}
