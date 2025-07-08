// create a program to find number of occurrences of an element in an array

import java.util.Scanner;

class ArrayOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now enter the number tou want to find: ");
        int num = input.nextInt();
        int Occurrences = noOfOccurrences(numArr, num);
        System.out.println("Your element was found " + Occurrences + " times in the array");

    }
    // Make another method
    public  static int noOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i =0;
        while (i < numArr.length){
            if (numArr[i] ==num) {
                occ++;

            }
            i++;
        }
        return occ;
    }

}
