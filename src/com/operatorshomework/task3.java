package com.operatorshomework;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        float price = sc.nextFloat();
        System.out.println("Enter product quantity: ");
        int quantity = sc.nextInt();

        if (quantity < 100) {

            float totalPrice = quantity * price;
            System.out.println("The revenue from sale:" + totalPrice);
            System.out.println("No discount applied.");

        } else if (quantity >= 100 && quantity <= 120) {

            float totalPrice = quantity * price;
            float discount = (totalPrice / 100) * 15;
            float totalRevenue = totalPrice - discount;
            System.out.println("The revenue from sale:" + totalRevenue);
            System.out.println("Discount:" + discount);

        } else {

            float totalPrice = quantity * price;
            float discount = (totalPrice / 100) * 20;
            float totalRevenue = totalPrice - discount;
            System.out.println("The revenue from sale:" + totalRevenue);
            System.out.println("Discount:" + discount);

        }
    }
}