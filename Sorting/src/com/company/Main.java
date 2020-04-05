package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
    	//bubble sort
	int [] num={0,1,2,3,4,5,6,7,8,0};
	int n=num.length;

	BubbleSort bubbleSortnew = new BubbleSort();
	bubbleSortnew.bubbleSort(num);

	for (int i=0; i<n; i++){
        System.out.print(num[i]+ " ");
    }
		System.out.println(" ");

    // merge sort
	int [] num1 = {1,1,1,1,1,1,1,1,1,0};
		int n1=num1.length;
	MergeSort mergeSortNew = new MergeSort();
	mergeSortNew.mergeSort(num1, 0, n1-1);

	for (int i=0; i<n1; i++ ) {
		System.out.print(num1[i] + " ");
	}
		System.out.println(" ");

	// selection sort
		int [] num2 = {0,1,2,3,5,5,5,7,8,0};
		int n2=num2.length;
		SelectionSort selectionSortNew = new SelectionSort();
		selectionSortNew.selectionSort(num2, 0, n2-1);

		for (int i=0; i<n2; i++)
			System.out.print(num2[i] + " ");
    }

}
