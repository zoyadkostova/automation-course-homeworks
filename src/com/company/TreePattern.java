package com.company;

import java.util.Scanner;

public class TreePattern {

    public static void main(String args[]) {
        System.out.println("Tree height: ");
        Scanner obj=new Scanner(System.in);
        int treeHeight = obj.nextInt();
        System.out.println();
        printTreePattern(treeHeight);
    }

    static void printTreePattern(int treeHeight){
        for(int i=1; i<=treeHeight; i++)
        {
            for(int k=treeHeight-i; k>0; k--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}