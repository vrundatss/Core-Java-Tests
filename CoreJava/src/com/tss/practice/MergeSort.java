package com.tss.practice;

public class MergeSort {

    public static void merge(int[] arr , int left , int mid , int right){
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int leftArray[] = new int[size1];
        int rightArray[] = new int[size2];

        for (int i = 0; i < size1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < size2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < size2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr , int left , int right){

        if(left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr , left , mid);
            mergeSort(arr , mid + 1 , right );

            merge(arr , left , mid , right);
        }
    }


    public static void main(String args[]) {
        int[] arr = {10, 6, 4, 20, 5 , 8};

        mergeSort(arr , 0  , arr.length - 1);
        System.out.println("\nSorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "   ");
        }
    }

}
