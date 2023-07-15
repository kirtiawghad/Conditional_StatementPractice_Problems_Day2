package com.bridgelabz;

public class ForLoopPalindrowNum {
    public static void main(String[] args) {
        int num = 154, reminder, reverse = 0 , temp;

          temp = num;
        for (; temp!=0; temp/=10){
            reminder = temp %10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println(reverse);
        if (num == reverse){
            System.out.println("it is palindrow number");
        }else {
            System.out.println("not palindrow number");
        }
    }
}
