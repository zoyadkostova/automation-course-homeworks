package com.operatorshomework;

import java.util.Scanner;

public class task2 {

    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input your age: ");
        age = sc.nextInt();
        if(age >=16)
            System.out.println("You are eligible to work.");
        else
            System.out.println("You are not eligible to work.");
    }
}