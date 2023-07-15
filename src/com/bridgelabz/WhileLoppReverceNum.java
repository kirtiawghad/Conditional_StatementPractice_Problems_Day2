package com.bridgelabz;
import java.util.*;
public class WhileLoppReverceNum {
    public static void main(String[] args) {
        int num, reminder, reverce = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0){
            reminder = num % 10;
            reverce = reverce * 10 + reminder;

            num = num /10;
        }
        System.out.println(reverce);
    }
}
