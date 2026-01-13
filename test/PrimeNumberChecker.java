package com.tss.test;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        if(isPrime(number)){
            System.out.print( number + " is a prime number... ");
        }else{
            System.out.print(number + " is not a prime number... ");
        }
    }
    public static boolean isPrime(int number){
//        boolean isPrime = true;
        int i;
        if( number <= 1){
            return false;
        }
        for (i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
