package com.datastructures;

public class task4 {

    // Java Program to find maximum in arr[]
    public static void main(String[] args) {
        {
             int arr[] = {10, 2, 3, 4, 5};

                int i;

                // Initialize maximum element
                int max = arr[0];

                // Traverse array elements from second and
                // compare every element with current max
                for (i = 1; i < arr.length; i++){
                    if (arr[i] > max)
                        max = arr[i];
            }
            System.out.println("Largest in given array is " + max);
        }
    }

}