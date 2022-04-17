package com.methods;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string1 = sc.nextLine();

        int length = string1.length();
        int middle;
        int middle1;

        if (length % 2 != 0) {
            middle = length / 2;
            System.out.println("Middle character in the odd string is: " + string1.charAt(middle));
        } else {
            middle = length / 2;
            middle1 = length / 2 + 1;
            System.out.println("Middle characters in the even string are: " + string1.charAt(middle) + string1.charAt(middle1));
        }
        countWordsInAString(string1);
    }
        public static int countWordsInAString(String args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a sentence: ");
            String string1 = sc.nextLine();
            String[] words = string1.split("\\s+");
            System.out.print("Number of words in the string: " + words.length);
            return words.length;
    }
}