package com.company;

public class SelectionSort {
    public void selectionSort(int[] numbers, int low, int high) {
        for (int h = low; h <= high; h++) {
            swap(numbers, h, getSmallest(numbers, h, high));
        }
    }

    public int getSmallest(int[] numbers, int low, int high) {
        int small = low;
        for (int i = low + 1; i <= high; i++) {
            if (numbers[i] < numbers[small])
                small = i;
        }
        return small;
    }
    public void swap (int [] numbers, int i, int j){
        int value = numbers [i];
         numbers [i] = numbers [j];
         numbers [j] = value;
    }
}
