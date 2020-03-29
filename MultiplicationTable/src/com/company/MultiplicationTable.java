package com.company;

public class MultiplicationTable {
   public void calculateMultTable (){
       for (int i=1; i<10; i++){
           int a;
           for (int j=1; j<10; j++){
               a=i*j;
               System.out.printf("%4d", a);
           }
           System.out.println();
       }
   }
}
