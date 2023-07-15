package com.bridgelabz;
import java.util.*;
public class IfElseDIsplyNum {

    //Read a Number 1,10,100,1000 and display unit, ten hundred
    public static void main(String[] args) {
       int num;
       Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
        if (num >=0 && num<=9){
            System.out.println("one ");
        } else if (num >=10 && num<=99 ) {
            System.out.println("two");
        } else if (num>=100 && num<=999) {
            System.out.println("three");
        } else if (num >=1000 && num<=9999) {
            System.out.println("four");
        }else {
            System.out.println("not this valid number");
        }

    }
}
