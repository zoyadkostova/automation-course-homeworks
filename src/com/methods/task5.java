package com.methods;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input non-negative number: ");
        int number = sc.nextInt();

        while (number < 0) {
            System.out.println("This is not a non-negative number. Please input a non-negative number: ");
            number = sc.nextInt();
        }

        String string = String.valueOf(number);
        int check = 1;
        string = string.toLowerCase();

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                check = 0;
                break;
            }
        }

        if (check == 1) {
            System.out.println("Number is palindrome.");
        } else {
            System.out.println("Number is not a palindrome.");
        }
    }
}
