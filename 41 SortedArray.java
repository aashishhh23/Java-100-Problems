// create a program to check if the given array is sorted

import java.util.Scanner;

class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Check Post \n");
        int[] numArr = ArrayUtility.inputArray();

        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);

        if (isInc || isDec) {
            System.out.println("Your array is Sorted");
        } else {
            System.out.println("Your array is not sorted");
        }

    }


    // we have to make 2 methods 1st one for Decreasing and 2nd one is for Increasing

    public static boolean isIncreasing(int[] numArr) {
        int i= 1;
        while (i< numArr.length) {
            if (numArr[i] < numArr[i-1]) {
                return false;
            }
            i++;

        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i-1]) {
                return  false;
            }
            i++;
        }
        return true;

    }
}