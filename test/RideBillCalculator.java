package com.tss.test;

import java.util.Scanner;

public class RideBillCalculator {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height (in cm) : ");
        int height = scanner.nextInt();

        int total = 0;
        if(height < 0){
            System.out.print("Enter valid height value...");
            return;
        }
        if (height > 120) {
            System.out.print("Enter age : ");
            int age = scanner.nextInt();
            if(age < 0){
                System.out.print("Enter valid age value...");
                return;
            }
            int bill = forAge(age);

            System.out.print("Want photos? (Yes/No) : ");

            String photo = scanner.next();

            if (photo.equals("Yes")) {
                total = bill + 3;
            } else {
                total = bill;
            }
            System.out.println("Total bill : $" + total);

        }else {
            System.out.println("Can't Ride... ");
        }

    }
    public static int  forAge(int age){
        if(age < 12)
        {
            return 5;
        } else if (age >= 12 && age <= 18) {
            return 7;
        } else if (age > 18 && age < 45) {
            return 12;
        }else if( age >= 45 && age <= 55){
            return  0;
        }

        return age;
    }

}
