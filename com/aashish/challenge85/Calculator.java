// In a class Calculator, create multiple add() methods that overload each other and
// can sum 2 integers, 3 integers, or 2 doubles. Demonstrate how each can be called with different numbers of parameters.



package com.aashish.challenge85;

public class Calculator {

    public int add(int first, int second){
        return first+second;
    }
    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(5,6,7));
        System.out.println(calc.add(5.6,6.2));

    }
}
