package com.company;

public class MultNumbersWithinArgument {
    public int multNumbWithinArg (int number){
       String strnum = String.valueOf(number);
       int n=strnum.length();
       int result=0;
       if (n==1){
           return number;
       }
       else if (strnum.contains("0")){
           return 0;
       }
       else {
           int firstChar = Integer.parseInt(strnum.substring(0, 1));
           for (int i=1; i<n; i++){
               int currentChar = Integer.parseInt(strnum.substring(i, i+1));
              firstChar=firstChar*currentChar;
           }
          return firstChar;
        }
    }
}
