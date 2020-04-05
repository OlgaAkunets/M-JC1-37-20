package com.company;

import java.util.ArrayList;

public class SortingWithRemovingDoubleItem {
    public ArrayList<Integer> bubbleSort (int[] numbers){
        int n = numbers.length;
        int value=0;
        ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            int firstnumber= numbers [i];
            if (!sortedNumbers.contains(firstnumber)){
                sortedNumbers.add(firstnumber);
            }
        }
        int newArrayLength = sortedNumbers.size();
        for (int i=0; i<newArrayLength; i++){
            for (int j=1; j<(newArrayLength-i); j++){
                if (sortedNumbers.get (j-1) > sortedNumbers.get(j)){
                    value=sortedNumbers.get(j-1);
                    sortedNumbers.set(j-1, sortedNumbers.get(j));
                    sortedNumbers.set(j, value);
                }
            }
        }
        return sortedNumbers;
    }
}
