package com.company;

public class BubbleSort {
    public void bubbleSort (int[] numbers){
        int n = numbers.length;
        int value=0;

        for (int i=0; i<n; i++){
            for (int j=1; j<(n-i); j++){
                if (numbers [j-1] > numbers[j]){
                    value=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=value;
                }
            }
        }
    }

}
