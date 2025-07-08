// Create a class ArrayOperations with a static nested class Statistics.
// Statistics could have methods like mean(), median(), which operate on an array.

package com.aashish.challenge82;

public class ArrayOperations {

    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
         // create 2 method

        double mean() {
            double sum = 0;
         for (int number: numbers) {
             sum +=number;
         }


            return sum/numbers.length;

        }

        double median () {
            return  0;
        }
    }
}
