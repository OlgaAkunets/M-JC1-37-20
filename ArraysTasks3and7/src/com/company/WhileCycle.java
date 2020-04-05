package com.company;

public class WhileCycle {
    public int [] executeWhile (String number){
        int length = number.length();
        int [] usersArray = new int [length];
        int i=0;
        while  (i<length){
            usersArray [i] = Integer.parseInt(number.substring(i, i+1));
            i++;
        }
        return usersArray;
    }
}
