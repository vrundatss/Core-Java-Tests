package com.tss.test;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();


        int temp = n;
        int sum = 0;
//        int count = 0;
//        while (temp != 0){
//            int r = temp % 10;
//            count++;
//            temp = temp / 10;
//
//        }
        while (temp != 0){
            int r = temp % 10;
            sum += Math.pow(r , 3); // order of n
            temp = temp / 10;


        }
        if(sum == n){
            System.out.print( n + " is a armstrong number... ");
        }else{
            System.out.print(n + " is not a armstrong number... ");
        }
    }
}
