package com.company;

import java.util.Scanner;

public class Perimeter {
//Perimeter class
    public static void main(String[] args){

        float side1,side2,side3, perimeter;
        Scanner obj=new Scanner(System.in);
        System.out.println("Side 1: ");
        side1=obj.nextFloat();
        System.out.println("Side 2: ");
        side2=obj.nextFloat();
        System.out.println("Side 3: ");
        side3=obj.nextFloat();
        perimeter = side1 + side2 + side3;
        System.out.println("Perimeter is :" + perimeter);

    }
}