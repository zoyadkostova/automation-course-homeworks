package com.company;
import java.util.Scanner;
public class QuadraticEquation {

    public static void main(String args[]){
        double root2 = 0, root1 = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = obj.nextDouble();
        System.out.println("Enter b: ");
        double b = obj.nextDouble();
        System.out.println("Enter c: ");
        double c = obj.nextDouble();
        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);
        if(determinant>0){
            root1 = (-b + sqrt)/(2*a);
            root2 = (-b - sqrt)/(2*a);
            System.out.println("Roots are: "+ root1 +" and "+root2);
        }else if(determinant == 0){
            System.out.println("Root is: "+(-b + sqrt)/(2*a));
        }
    }
}