package com.tss.practice;

public class MinMaxFromArray {
    public static void main(String args[]){
        int[] arr = {10 , 6, 4, 20 ,5};
        int max = arr[0];
        int min =  arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum element is : " + min);
        System.out.println("Maximum element is : " + max);

    }
}
