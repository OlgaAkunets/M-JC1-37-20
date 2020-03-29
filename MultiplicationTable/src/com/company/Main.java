package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    MultiplicationTable multTableNew = new MultiplicationTable();
         multTableNew.calculateMultTable();

        System.out.println("Введите любое число начиная с 1: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        Multiply1andN  multiply1andNnew= new Multiply1andN();
        System.out.println(multiply1andNnew.multiply1andN(number));

        MultNumbersWithinArgument multNumbersWithinArgumentNew = new MultNumbersWithinArgument();
        System.out.println(multNumbersWithinArgumentNew.multNumbWithinArg(number));
    }

}
