import java.util.Scanner;

class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Finding Occurrences");
        int[] nums = ArrayUtility.inputArray(); // input array
        System.out.println("Now enter the number you want to search");
        int element = input.nextInt();
        int occ = CountOccurrences(nums, element);
        System.out.println("Your element was found: " + occ+ "times");

    }
    public static int CountOccurrences(int[] nums,int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            }

        }
        return occ;
    }
}
