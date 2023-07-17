package com.bridgelabz;
import java.util.*;
public class OpratoersMinMaxFind {

    public static void main(String[] args) {
        int a,b,c;
        float result1 = 0, result2 =0, result3=0,result4=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a");
        a = sc.nextInt();
        System.out.println("enter the b");
        b = sc.nextInt();
        System.out.println("enter the c");
        c = sc.nextInt();

        result1 = a+b*c;  //a=2 b=3 c=4 2+3*4 = 14
        System.out.println(result1);

        result2 = c+(a/b);
        System.out.println(result2);

        result3 = a%b+c;
        System.out.println(result3);

        result4 = a*b+c;
        System.out.println(result4);

        if (result1 > result2 && result1 > result3 && result1 >result4 ){
            System.out.println("is maximum :" + result1);
        } else if (result2> result1 && result2 > result3 && result2 >result4) {
            System.out.println("is maximum :" + result2);
        }else if (result3> result1 && result3 > result2 && result3 >result4) {
            System.out.println("is maximum :" + result3);
        }else if (result4> result1 && result4 > result2 && result4 >result3) {
            System.out.println("is maximum :" + result4);
        }

        if (result1 < result2 && result1 < result3 && result1 < result4 ){
            System.out.println("is minimum :" + result1);
        } else if (result2 < result1 && result2 < result3 && result2 < result4) {
            System.out.println("is minimum :" + result2);
        }else if (result3 < result1 && result3 < result2 && result3 < result4) {
            System.out.println("is minimum :" + result3);
        }else if (result4 < result1 && result4 < result2 && result4 < result3) {
            System.out.println("is minimum :" + result4);
        }

    }
}
