package com.methods;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input int argument: ");
        int argument = sc.nextInt();
        isEven(argument);
    }
    public static boolean isEven(int argument) {
        if(argument % 2 == 0){
            System.out.print("True.");
            return true;
        }
        else{
            System.out.print("False.");
            return false;
        }
    }
}
