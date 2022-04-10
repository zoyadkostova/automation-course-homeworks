package com.operatorshomework;
import java.util.Arrays;

public class task4 {

        public static void main(String args[]){
            int array[] = {7, 2, 3, 4, 9, 6, 1};
            int size = array.length;
            Arrays.sort(array);
            int largestNumber = array[size-1];
            System.out.println("The largest number in the array is: " + largestNumber);
        }
}
