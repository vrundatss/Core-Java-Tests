package com.tss.test;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int sum = 0 , i;
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if(sum == number){
            System.out.print( number + " is a perfect number... ");
        }else{
            System.out.print(number + " is not a perfect number... ");
        }
    }
}
