package com.tss.practice;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
//        int[] arr = {10, 6, 4, 20, 5};
//        int length = arr.length;

        System.out.print("Enter size of the array : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("Enter " + length +" elements : ");
        int[] arr = new int[length];
        for(int i = 0; i < length ; i++){
            arr[i] = scanner.nextInt();
        }

        int temp = 0;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i -1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "   ");
        }
    }
}
