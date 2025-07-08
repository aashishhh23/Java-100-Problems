// create a program to swap two numbers.

// in the assignment operator( a=b)  :- agr b ki value a mein dalni hai to wo right m hona chhahiye
// and jisme daalni howo hmesa left mein hona chahiye

import java.util.Scanner;

class Swap6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station\n\n");
        System.out.println("Enter value of A: ");
        int a= input.nextInt();
        System.out.println("Enter value of B");
        int b = input.nextInt();

        int c = a;
        a = b;
         b = c;

        System.out.println("Swapping is done....");
        System.out.println("value of A is: " +a);
        System.out.println("value of B is: " +b);

    }


}
