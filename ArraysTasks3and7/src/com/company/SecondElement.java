package com.company;

public class SecondElement {
    public int[] selectSecondElement(String number) {
        int length = number.length();
        int length2 = length / 2;
        int[] eachSecondElement = new int[length2];
        int x = 0;
        for (int i = 0; i < length; i++) {
            if ((i+1) % 2 == 0) {
                eachSecondElement[x] = Integer.parseInt(number.substring(i, i + 1));
                x++;
            }
        }
        return eachSecondElement;
    }
}
