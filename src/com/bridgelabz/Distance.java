package com.bridgelabz;

import java.util.*;

public class Distance {
    public static void main(String[] args) {
        //Write a program Distance.java that takes two integer command-line arguments x and y
        // and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
        // The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
        double x1 = 0, y1 = 0 , distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x2 :");
        double x2 = sc.nextDouble();

        System.out.println("enter the y2 :");
        double y2 = sc.nextDouble();

      //  distance = sqrt(x*x + y*y).

        distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println(distance);


    }
//
}