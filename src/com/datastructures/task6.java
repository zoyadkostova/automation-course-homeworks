package com.datastructures;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int j=0;

        while (j<4) { // add numbers to the matrix
            for (int i = 0; i < 4; i++){
                System.out.println("Input matrix numbers: ");
                int number = sc.nextInt();
                arr[i][j] = number;
            }
            j++;
        }

        for (int i = 0; i < 4; i++) { // print the matrix
            for (j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



        int sum = 0;
        for (int row = 0; row < arr[0].length; row++) {
                sum += arr[row][row];
            }
        System.out.println("Left to right diagonal sum: " + sum);


        int sum1 = 0;
        for (int row = 0; row < arr[0].length; row++) {
                sum1 += arr[row][arr.length - row - 1];
            }
        System.out.println("Right to left diagonal sum: " + sum1);
    }

}
