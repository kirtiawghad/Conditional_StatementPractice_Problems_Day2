package com.bridgelabz;

import java.util.*;

public class Distance {
    public static void main(String[] args) {
        //Write a program Distance.java that takes two integer command-line arguments x and y
        // and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
        // The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x :");
         double x =sc.nextDouble();

        System.out.println("enter the y :");
        double y =sc.nextDouble();


        //distance = sqrt(x*x + y*y).
//
        double distance = Math.sqrt(Math.pow(x,x) + Math.pow(y,y));
        System.out.println(distance);




    }
}
