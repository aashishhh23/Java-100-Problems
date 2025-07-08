import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Set Your Password\n");
        String password;
        do {
            System.out.print("Please Enter your password: ");
            password = input.next();

        } while (!isValidPassword(password));
        System.out.println("Thanks, for entering a valid password");


    }

    public static boolean isValidPassword(String password) {

        return password.length()>6;
    }
}
