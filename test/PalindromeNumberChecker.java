package com.tss.test;

import java.util.Scanner;

public class PalindromeNumberChecker {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();


        int answer = reverse(number);
        if(answer == number){
            System.out.print( number + " is a Palindrome number... ");
        }else{
            System.out.print(number + " is not a Palindrome number... ");
        }
    }

    public static int reverse(int number){
        int reminder = 0 , reversed = 0;
        while ( number != 0){
            reminder = number % 10;
            reversed = reversed * 10 + reminder;
            number = number / 10;

        }

        return reversed;
    }
}
