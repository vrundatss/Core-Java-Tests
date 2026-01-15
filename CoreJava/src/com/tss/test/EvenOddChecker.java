package com.tss.test;

import java.util.Scanner;

public class EvenOddChecker {
     public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number : ");
         int n = scanner.nextInt();

         if(n % 2 == 0){
             System.out.println("Number is Even...");
         }else{
             System.out.println("Number is Odd...");
         }
     }

}
