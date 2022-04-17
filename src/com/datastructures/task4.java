package com.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        {
            ArrayList<Integer> list = new ArrayList<Integer>();

            Scanner sc = new Scanner(System.in);
            System.out.print("Input list length: ");
            int length = sc.nextInt();

            System.out.print("Add first number in the list: ");
            int i=0;
            for (i = 0; i < length; i++) {
                System.out.print("Add next number: ");
                int number = sc.nextInt();
                list.add(number);
            }

            System.out.println("Before Sorting: " + list);
            Collections.sort(list);
            System.out.println("After Sorting: " + list);
            System.out.println("Biggest number in the list: " + list.get(i-1));
        }
    }
}