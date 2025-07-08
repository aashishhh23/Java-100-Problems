//          CREATE A PROGRAM TO INPUT NAME OF THE PERSON AND RESPOND WITH "Welcome NAME to KG Coding"


import java.util.Scanner;

class Welcome4 {
    public static void main(String[] args) {
        System.out.print("Please enter your name: "); // after remove ln output will be in the same line
        // take input via scanner
        Scanner input = new Scanner(System.in); // Object initialise
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");


    }
}
