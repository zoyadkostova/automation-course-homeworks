package com.company;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args){

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = obj.nextLine();
        System.out.println("Enter surname: ");
        String surname = obj.nextLine();
        System.out.println("Enter last name: ");
        String lastName = obj.nextLine();

        System.out.println("Full name is :" + " " + name +  " " + surname +  " " + lastName);

    }
}
