package com.bridgelabz;
import java.util.*;
public class WhileLoopNaturalNumSum {

    public static void main(String[] args) {
        int num,sum =0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i=1;
        while (i<=num){
            sum = sum + i;
            i++;
        }
        System.out.println("the natural number sum is :" + sum);
    }
}
