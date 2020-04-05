package com.company;

public class ForCycle {
    public int[] executeForCycle(String number) {
        int length = number.length();
        int[] usersArray = new int[length];
        for (int i = 0; i < length; i++) {
            usersArray[i] = Integer.parseInt(number.substring(i, i + 1));
        }
        return usersArray;
    }

}
