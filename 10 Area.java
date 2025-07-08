 // create a program to calculate Area of a Triangle

 import java.util.Scanner;

 class TriangleArea {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Welcome to Area Calculator\n\n");

         System.out.println("Please enter base in cms");
         double base = input.nextDouble();
         System.out.println("Now, enter height in cms");
         double height = input.nextDouble();


         double area = 0.5 *base*height;
         System.out.println("Area of Triangle is: " + area + "cms2");


     }
}
