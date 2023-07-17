package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args){
       // Write a program SpringSeason.java that takes two int values m and d from the command line
        // and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20),
        // false otherwise.
        int m;
        int d;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the month");
        m = sc.nextInt();

        System.out.println("enter the Day");
        d = sc.nextInt();

        switch (m){
            case 3:
                System.out.println("march");
                if (m >= 3 && d>=20 && m<6 && d<=31){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
                break;
            case 4:
                System.out.println("Apr");
                if (m >= 3 && d>=20 && m<6 && d<=31){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
                break;
            case 5:
                System.out.println("may");
                if (m >= 3 && d>=20 && m<6 && d<=31){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
                break;
               case 6:
                System.out.println("jun");
                if (m >= 3 && d>=20 && m<6 && d<=31){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
                break;
            default:
                System.out.println("not valid");
        }

    }
}
