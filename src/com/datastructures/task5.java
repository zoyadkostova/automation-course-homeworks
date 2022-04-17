package com.datastructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        System.out.println("Input list length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Input list numbers: ");
        for (int i = 0; i < length; i++) {
            int number = sc.nextInt();
            ll.add(number);
            }

        System.out.println("The elements of the linked list before reversing: " + ll);

        Collections.reverse(ll);
        System.out.println("The elements of the linked list after reversing: " + ll);
    }
}


