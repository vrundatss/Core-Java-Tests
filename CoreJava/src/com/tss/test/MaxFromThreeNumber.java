package com.tss.test;

import java.util.Scanner;

public class MaxFromThreeNumber {
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 3 numbers : ");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            if(n1 >= n2 && n1 >= n3){
                System.out.println(n1 + " is Maximum number");
            }
            else if (n2 >= n3){
                System.out.println(n2 + " is Maximum number");
            }
            else{
                System.out.println(n3 + " is Maximum number");
            }
        }

    }


