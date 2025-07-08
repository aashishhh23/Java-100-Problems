 // Create a program to calculate compound interest
 //Formula:- P(1+R/100)t

 import java.util.Scanner;

 class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Compound interest calculator: \n");
        System.out.println("Please enter your principle amount");

        int principle = input.nextInt();
        System.out.println("now tell me your rate of interest");
        float rate = input.nextFloat();
        System.out.println("Now, tell me for how many years are you borrowing this");
        float years =input.nextFloat();

        double compoundInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("your compound interest is Rs:" + compoundInt);


    }


}
