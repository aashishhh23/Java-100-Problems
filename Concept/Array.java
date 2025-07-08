package Concept;

public class Array {
    public static void main(String[] args) {
 //       int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[3] = 38;
//        myArr[1] = 8;
//        myArr[2] = 9;
//        myArr[4] = 37; // OR

        int[] myArr = { 98, 38, 8, 9, 37};
       // int index =2;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[5]);


//        int index = 0;
//        while (index < 5) {
//            System.out.println(myArr[index]);
//            index++;

        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
    }
}


        }