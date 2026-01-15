package com.tss.practice;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int length = arr.length;

        int min_index = 0 , temp = 0;

        for (int i = 0; i < length - 1; i++) {
            min_index = i;

            for(int j = i + 1; j < length; j++){
                if(arr[j] < arr[min_index] ){
                    min_index = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String args[]) {
        int[] arr = {10, 6, 4, 20, 5};

        selectionSort(arr);
        System.out.println("\nSorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "   ");
        }
    }
}
