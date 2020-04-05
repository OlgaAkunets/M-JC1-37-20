package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите ряд чисел начная с 0:");
        Scanner scan = new Scanner(System.in);
        String number = scan.next();

        ForCycle objectForCycle = new ForCycle();
        int [] intArrayFor = objectForCycle.executeForCycle(number);

        System.out.printf(Arrays.toString(intArrayFor) + "\n");

        WhileCycle objectWhileCycle = new WhileCycle();
        int [] intArrayWhile = objectWhileCycle.executeWhile(number);

        System.out.printf(Arrays.toString(intArrayWhile) + "\n");

        DoWhileCycle objectDoWhileCycle = new DoWhileCycle();
        int [] intArrayDoWhile = objectDoWhileCycle.executeDoWhile(number);

        System.out.printf(Arrays.toString(intArrayDoWhile) + "\n");

        ForEachCycle objectForEach = new ForEachCycle();
        int [] intarrayForEach = objectForEach.executeForEach(number);

        System.out.printf(Arrays.toString(intarrayForEach) + "\n");

        SecondElement secondElementSelection = new SecondElement();
        int [] intArraySecondElement = secondElementSelection.selectSecondElement(number);

        System.out.printf(Arrays.toString(intArraySecondElement) + "\n");

        SortingWithRemovingDoubleItem removedSortedEls = new SortingWithRemovingDoubleItem();
        ArrayList<Integer> sortedArrayWithRemoved = removedSortedEls.bubbleSort(intArrayFor);

        System.out.printf(sortedArrayWithRemoved.toString());

    }
}
