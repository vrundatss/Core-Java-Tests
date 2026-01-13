package com.tss.test;

import java.util.Scanner;

public class MonthDisplayer {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number : ");
        int month = scanner.nextInt();
        String output = "";
        switch (month){
            case 1:
                output = "It's January";
                break;
            case 2:
                output = "It's Febuary";
                break;
            case 3:
                output = "It's March";
                break;
            case 4:
                output = "It's April";
                break;
            case 5: 
                output = "It's May";
                break;
            case 6:
                output = "It's June";
                break;
            case 7:
                output  = "It's July";
                break;
            case 8:
                output = "It's August";
                break;
            case 9:
                output = "It's September";
                break;
            case 10:
                output = "It's October";
                break;
            case 11:
                output = "It's November";
                break;
            case 12:
                output = "It's December";
                break;
            default:
                System.out.println("Invalid Month Number...");
        }
        System.out.println(output);
        
    }
}
