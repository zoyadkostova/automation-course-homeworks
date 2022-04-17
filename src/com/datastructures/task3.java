package com.datastructures;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input matrix height: ");
        int height = sc.nextInt();
        System.out.println("Input matrix length: ");
        int length = sc.nextInt();

        int[][] arr = new int[height][length];
        int j=0;

        while (j<length) { // add numbers to the matrix
            for (int i = 0; i < height; i++){
                System.out.println("Input matrix numbers: ");
                int number = sc.nextInt();
                arr[i][j] = number;
            }
            j++;
        }

            for (int i = 0; i < height; i++) { // print the matrix
                for (j = 0; j < length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

