package com.company;

public class MergeSort {
    public void mergeSort (int[] elements, int low, int high){
        if (low < high) {
            int mid = (low +high) / 2;
            mergeSort(elements, low, mid);
            mergeSort(elements, mid +1, high);
            merge(elements, low, mid, high);
        }
    }

    public void merge (int [] subset, int low, int mid, int high){
        int n = high-low+1;
        int [] value = new int [n];

        int i = low, j=mid + 1;
        int k = 0;

        while (i <= mid || j<=high){
            if (i > mid)
                value[k++] = subset[j++];
            else if (j>high)
                value [k++] = subset [i++];
            else if (subset[i] < subset[j])
                value[k++] = subset[i++];
            else
                value[k++] = subset[j++];
        }
        for (j=0; j<n; j++)
            subset [low + j] = value[j];
    }
}
