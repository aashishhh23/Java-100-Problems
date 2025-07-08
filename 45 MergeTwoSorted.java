// create a program to merge two sorted arrays

 class MergeTwoSorted {
  public static void main(String[] args) {
   System.out.println("Welcome to Merge Sorter");

   // these input 2 array
   int[] arr1 = ArrayUtility.inputArray();
   int[] arr2 = ArrayUtility.inputArray();

   //call

   int[] mergedArr = merge(arr1, arr2);
   System.out.println("Your merged array is: ");
   ArrayUtility.displayArray(mergedArr);


  }

  // method
  public static int[] merge(int[]arr1, int[] arr2) {

   // make an array

   int newSize = arr1.length + arr2.length;
   int[] newArr = new int[newSize];

   // 3 pointer
   int i = 0, j =0, k=0;
   while (i < arr1.length || j < arr2.length) {
    if (j== arr2.length ||
            (i< arr1.length  && arr1[i] < arr2[j])) {
        newArr[k] = arr1[i];
        i++;
        k++;
    } else {
       newArr[k] =arr2[j];
       k++;
       j++;
    }
   }
   return newArr;
  }
}
