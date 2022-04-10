package com.operatorshomework;

public class task6 {
    public static void main(String args[]) {

        int list1[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        System.out.println("Numbers divisible by 5 are: ");

        for (int i = 0; list1[i] <= 150; i++) {
            if (list1[i] % 5 == 0)
                System.out.print(list1[i] + " ");
        }
    }
}
