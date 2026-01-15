package com.tss.practice;

public class ReverseArray {
    public static void main(String args[]){
        int[] arr = {10 , 6, 4, 20 ,5};

        reverse(arr);

        System.out.println("Reversed Array : ");

        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "   ");
        }

    }

    public static void reverse(int[] arr){
        int end  = arr.length -1;
        int start = 0 , temp = 0;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
}
