package com.tss.test;

import java.util.Scanner;

public class CurrencyDenominationApp {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount : ");
        int amount = scanner.nextInt();

        if( amount > 50000){
            System.out.println("Enter amount in less then 50000...");
            return;
        }

        if( amount % 100 != 0){
            System.out.println("Enter amount in multiple of 100...");
            return;
        }
        if(amount < 0){
            System.out.println("Enter valid amount...");
            return;
        }

        int[] notes = {2000 , 500 , 200, 100};

        for(int i = 0; i < notes.length; i++){
            int count = amount / notes[i];

            System.out.println(notes[i] + " : " + count);

            amount = amount % notes[i];

        }

    }
}
