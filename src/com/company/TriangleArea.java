package com.company;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args){

        float b,h,area;
        Scanner obj=new Scanner(System.in);
        System.out.println("Base of triangle: ");
        b=obj.nextFloat();
        System.out.println("Height of triangle: ");
        h=obj.nextFloat();
        area = ( b*h)/2;
        System.out.println("Triangle area is: " + area);

    }
}