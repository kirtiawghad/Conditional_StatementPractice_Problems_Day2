package com.bridgelabz;

import java.util.*;
import java.lang.Math;
public class Quadratic {
    public static void main(String[] args) {
        //a*x*x + b*x + c

        //delta = b*b - 4*a*c

        //Root 2 of x = (-b - sqrt(delta))/(2*a)

        double a,b,c,root_1,root_2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a");
        a = sc.nextDouble();

        System.out.println("enter the b");
        b = sc.nextDouble();

        System.out.println("enter the c");
        c = sc.nextDouble();

        System.out.println("delta is :");

        double delta = b*b - 4*a*c;

        System.out.println(delta);

        if (delta > 0){

            root_1 = (-b + Math.sqrt(delta)) / (2 * a);
            root_2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root_1, root_2);

        }

      else if (delta == 0){

            root_1 = root_2 = -b/(2*a);
            System.out.format("root1 = root2 = %.2f", root_1 ,root_2);
        }
      else {

          double real = -b/(2*a);
          double imagnary = Math.sqrt(-delta)/(2*a);
            System.out.println("root1" +" "+real);
            System.out.println( "root2"+ " " +imagnary);

        }
    }
}
