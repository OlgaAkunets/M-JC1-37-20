package com.company;

public class Main {

    public static void main(String[] args) {

    }

    //Sleep-In
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday==false && vacation==false){
            return true;
        }
        else if (weekday==true && vacation==false){
            return false;
        }
        else if (weekday==false && vacation==true){
            return true;
        }
        else {
            return true;
        }
    }
    //diff21
    public int diff21(int n) {
        if (n>=0 & n<=21){
            return 21-n;
        }
        else {
            return (n-21)*2; }
    }
    // nearHundred
    public boolean nearHundred(int n) {
        if ((n>=90 & n<=100)||(n>=190 & n<201)){
            return true;
        }
        else {
            return false;
        }

    }
    //missingChar
    public String missingChar(String str, int n) {
        String subString1=str.substring(0, n);
        String subString2=str.substring(n+1);
        return subString1 + subString2;

    }
    //backAround
    public String backAround(String str) {
        int n=str.length()-1;
        String lastCh=str.substring(n);
        return lastCh+str+lastCh;

    }
    //startHi
    public boolean startHi(String str) {
        if (str.startsWith("hi")) {
            return true;
        }
        else {
            return false;
        }
    }
    //hasTeen
    public boolean hasTeen(int a, int b, int c) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
            return true;
        }
        else {
            return false;
        }
    }
    //mixStart
    public boolean mixStart(String str) {
        return str.startsWith ("ix", 1);
    }
    //stringE
    public boolean stringE(String str) {
        int eCount=0;
        int n=str.length ();
        for (int i=0; i<n; i++){
            char eCh=str.charAt(i);
            if (eCh=='e'){
                eCount=eCount+1;
            }
        }
        if (eCount>=1 && eCount<=3){
            return true;
        }
        else {
            return false;

        }
    }
    //Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    public String everyNth(String str, int n) {
        String newResult=Character.toString(str.charAt(0));
        int x = str.length();
        for (int i=1; i<x; i++){
            if (i%n==0){
                char selectedCh=str.charAt(i);
                newResult=newResult+selectedCh;
            }

        }
        return newResult;
    }
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile==true && bSmile==true){
            return true;
        }
        else if (aSmile==true && bSmile==false){
            return false;
        }
        else if (aSmile==false && bSmile==true){
            return false;
        }
        else {
            return true;
        }
    }
}
