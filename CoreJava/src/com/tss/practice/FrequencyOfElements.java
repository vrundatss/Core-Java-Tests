package com.tss.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String args[]){
        int[] arr = {10 , 6,6 , 9 , 6 , 5 , 10 , 4, 20 ,5};
        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){  // O(n^2)

            if(visited[i])
                continue;

            int count = 1;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("Element " + arr[i] + " is Occurs " + count + " times." );

        }

//        HashMap<Integer , Integer> freqMap= new HashMap<>(); // O(n)
//
//        for (int element : arr){
//            freqMap.put(element , freqMap.getOrDefault(element, 0) + 1);
//        }
//        for(Map.Entry<Integer , Integer> element : freqMap.entrySet()){
//            System.out.println("Element " + element.getKey() + " is Occurs " + element.getValue() + " times.");
//        }
    }
}
