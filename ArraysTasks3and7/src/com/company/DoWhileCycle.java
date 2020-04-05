package com.company;

public class DoWhileCycle {
    public int [] executeDoWhile (String numbers){
        int length=numbers.length();
        int [] usersArray = new int [length];
        int i=0;
        do {
            usersArray [i] = Integer.parseInt(numbers.substring(i, i+1));
            i++;
        }while (i<length);
        return usersArray;
    }
}
