package com.bridgelabz;
public class ForLoopNaturalNumSum {
    //Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
    public static void main(String[] args) {
        int num = 5 , sum = 0;
        for (int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("The Natural Number Sum is :"+ sum);
    }
}
