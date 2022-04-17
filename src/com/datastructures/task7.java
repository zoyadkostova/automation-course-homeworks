package com.datastructures;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String string = sc.nextLine();
        int check = 1;
        string = string.toLowerCase();

        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                check = 0;
                break;
            }
        }

        if(check == 1) {
            System.out.println("String is palindrome.");
        }
        else {
            System.out.println("String is not a palindrome.");
        }
    }
}



