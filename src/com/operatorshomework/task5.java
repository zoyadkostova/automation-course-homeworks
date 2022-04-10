package com.operatorshomework;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter budget per the day: ");
        float budget = sc.nextFloat();
        System.out.println("Choose preferred destination: enter 1 for beach or 2 for mountain");
        int destination = sc.nextInt();

        if (destination == 1) {

            if (budget<50){
                System.out.println("Suggested destination: Bulgaria.");
            } else{
                System.out.println("Suggested destination is outside Bulgaria.");
            }

        } else if (destination == 2) {

            if (budget<30){
                System.out.println("Suggested destination: Bulgaria.");
            } else{
                System.out.println("Suggested destination is outside Bulgaria.");
            }

        } else {

            System.out.println("There is no information about this type of vacation.");

        }
    }
}
