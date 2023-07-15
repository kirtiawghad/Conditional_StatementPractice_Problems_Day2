package com.bridgelabz;

public class ForLoopReverceNum {
    public static void main(String[] args) {
        int num = 231,reminder,reverce=0;

        for (; num!=0; num/=10){

            reminder = num % 10;
            reverce = reverce * 10 + reminder;

        }
        System.out.println(reverce);
    }
}
