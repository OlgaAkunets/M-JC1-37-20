package com.company;

public class Multiply1andN {
    public int multiply1andN (int number) {
        int result=1;
        for (int i=1; i<=number; i++) {
             result = result*i;
        }
        return result;
    }
}
