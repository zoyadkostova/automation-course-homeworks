package com.operatorshomework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class task7 {
    public static void main(String args[]) {

        int list1[] = {10, 20, 30, 40, 50};
        int arrayLength = list1.length - 1;

        for (int i = arrayLength; i >= 0; i--)
        {

            System.out.print(list1[i] + " ");
        }
    }
}
