// create a program to check is the array is palindrome or not
class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker \n ");
        int[] numArr = ArrayUtility.inputArray(); //Array input

        // call method'
        boolean isPalin = isPalindrome(numArr);
        if (isPalin) {
            System.out.println("Your array is Palindrome");

        }else {
            System.out.println("Your Array is not a palindrome ");
        }


    }

    // make a method

    public static boolean isPalindrome(int[] numArr) {

        // now compare first to last , second to second last, ..

        int i  = 0; // index starts with zero
        while (i < numArr.length / 2) {
            if(numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;

            }
            i++;
        }
        return true;
    }
}
