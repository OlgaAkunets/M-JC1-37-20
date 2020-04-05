package com.company;

public class ForEachCycle {
    public int [] executeForEach (String numbers){
        int length = numbers.length();
        int [] userArray = new int [length];
        int x=0;
        for ( int i:userArray){
            userArray[x] = Integer.parseInt(numbers.substring(x, x+1));
            x++;
        };
        return userArray;
    }

}
