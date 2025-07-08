// create a program to return a new array deleting a specific element

import java.util.Scanner;

class DeletingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to delete: ");
        int numToDelete = input.nextInt();

        // call method
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArr);


    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = ArrayOccurrences.noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }


        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];


        int i =0, j =0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j]=numArr[i];
                j++;

            }
            i++;
        }


        return newArr;

    }
}
