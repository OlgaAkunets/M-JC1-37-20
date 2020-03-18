package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {Task1(); Task2(); Task3Part1(); Task3Part2(); Task3Part3();
    }

    static void Task1() {
        int a = 42;
        int b = 15;
        int notOperatorForA = ~a;
        System.out.println(notOperatorForA);
        //-43, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1101_0101
        int notOperatorForB = ~b;
        System.out.println(notOperatorForB);
        //-16, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0000‬
        int andOperatorForAandB = a & b;
        System.out.println(andOperatorForAandB);
        // 10, 0010
        int andAssignOperatorForAandB = a &= b;
        System.out.println(andAssignOperatorForAandB);
        // 10, 0010
        a = 42;
        int orOperatorForAandB = a | b;
        System.out.println(orOperatorForAandB);
        // 47, 0010_1111
        int orAssignOperatorForAandB = a |= b;
        System.out.println(orAssignOperatorForAandB);
        // 47, 0010_1111
        a = 42;
        int orExclusivePeratorForAandB = a ^ b;
        System.out.println(orExclusivePeratorForAandB);
        // 37, 0010_0101
        int orExclAssignOperotorForAandB = a ^= b;
        System.out.println(orExclAssignOperotorForAandB);
        // 37, 0010_0101
        a = 42;
        int shiftR_OperatorForA = a >> 2;
        System.out.println(shiftR_OperatorForA);
        // 10, 0010
        int shiftR_OperatorForB = b >> 2;
        System.out.println(shiftR_OperatorForB);
        // 3, 0011
        int shiftR_assignOperatorForA = a >>= 2;
        System.out.println(shiftR_assignOperatorForA);
        // 10, 0010
        a = 42;
        int shiftR_assignOperatorForB = b >>= 2;
        System.out.println(shiftR_assignOperatorForB);
        // 3, 0011
        b = 15;
        int unsignedShiftR_OperatorForA = a >>> 2;
        System.out.println(unsignedShiftR_OperatorForA);
        // 10, 0010
        int shiftL_OperatorForA = a << 2;
        System.out.println(shiftL_OperatorForA);
        //168, 1010_1000
        int shiftL_OperatorForB = b << 2;
        System.out.println(shiftL_OperatorForB);
        //60, 0011_1100
        int shiftL_assignOperatorForA = a <<= 2;
        System.out.println(shiftL_assignOperatorForA);
        //168, 1010_1000
        a = 42;
        int shiftL_assignOperatorForB = b <<= 2;
        System.out.println(shiftL_assignOperatorForB);
        //60, 0011_1100
        b = 15;
        int unsignedShiftRassign_OperatorForA = a >>>= 2;
        System.out.println(unsignedShiftRassign_OperatorForA);
        // 10, 0010

        System.out.println("With negative Value");
        int c = -42;
        int d = -15;
        int notOperatorForC = ~c;
        System.out.println(notOperatorForC);
        //41, 0010_1001‬
        int notOperatorFord = ~d;
        System.out.println(notOperatorFord);
        //14, 1110
        int andOperatorForCandD = c & d;
        System.out.println(andOperatorForCandD);
        //-48
        int andAssignOperatorForCandD = c &= d;
        System.out.println(andAssignOperatorForCandD);
        //-48, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1101_0000‬
        c = -42;
        int orOperatorForCandD = c | d;
        System.out.println(orOperatorForCandD);
        //-9
        int orAssignOperatorForCandD = c |= d;
        System.out.println(orAssignOperatorForCandD);
        //-9, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0111‬
        c = -42;
        int orExclusivePeratorForCandD = c ^ d;
        System.out.println(orExclusivePeratorForCandD);
        //39
        int orExclAssignOperotorForCandD = c ^= d;
        System.out.println(orExclAssignOperotorForCandD);
        //39, 0001_1110
        c = -42;
        int shiftR_OperatorForC = c >> 2;
        System.out.println(shiftR_OperatorForC);
        //-11, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0101‬
        int shiftR_OperatorForD = d >> 2;
        System.out.println(shiftR_OperatorForD);
        //-4, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1100
        int shiftR_assignOperatorForC = c >>= 2;
        System.out.println(shiftR_assignOperatorForC);
        //-11, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0101‬
        c = -42;
        int shiftR_assignOperatorForD = d >>= 2;
        System.out.println(shiftR_assignOperatorForD);
        //-4, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1100
        b = -15;
        int unsignedShiftR_OperatorForC = c >>> 2;
        System.out.println(unsignedShiftR_OperatorForC);
        //1073741813, 0011_1111_1111_1111_1111_1111_1111_0101‬
        int shiftL_OperatorForC = c << 2;
        System.out.println(shiftL_OperatorForC);
        //-168, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0101_1000‬
        int shiftL_OperatorForD = d << 2;
        System.out.println(shiftL_OperatorForD);
        //-16, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0000
        int shiftL_assignOperatorForC = c <<= 2;
        System.out.println(shiftL_assignOperatorForC);
        //-168, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0101_1000‬
        c = -42;
        int shiftL_assignOperatorForD = d <<= 2;
        System.out.println(shiftL_assignOperatorForD);
        //-16, 1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0000
        d = -15;
        int unsignedShiftRassign_OperatorForC = c >>>= 2;
        System.out.println(unsignedShiftRassign_OperatorForC);
        //1073741813, 0011_1111_1111_1111_1111_1111_1111_0101‬
        int unsignedShiftRassign_OperatorForD = d >>>= 2;
        System.out.println(unsignedShiftRassign_OperatorForD);
        //1073741820, 0011_1111_1111_1111_1111_1111_1111_1100‬
    }

    static void Task2() {
        System.out.println("Task2");
        int first = 5 + 2 / 8;
        // 5 есть результат слажения 5 и 0 (получившегося в результате деления данных с типом int без остатка, то есть
        // приобразования ответа в int.
        System.out.println(first);
        int second = (5 + 2) / 8;
        System.out.println(second);
        // 0  есть результат деления данных с типом int и приобразованием ответа в данные int типа. Результат деления
        // без остатка.
        int t = 2;
        int third = (5 + t++) / 8;
        System.out.println(third);
        // на моменты выполнения операции в постинкрементном выражении t находилось значение 2. Как результат деления
        // данных с типом int. Деление без остатка.
        System.out.println(t);
        // после этой операции постинкременнтное t увеличилось на еденицу.
        int f1 = 2;
        int f2 = 8;
        int forth = (5 + f1++) / --f2;
        System.out.println(forth);
        //на моменты выполнения операции в постинкрементном выражении t находилось значение 2, а в преинкрементном - 7.
        System.out.println(f1 + " " + f2);
        int fif1 = 2;
        int fif2 = 8;
        int fifth = (5 * 2 >> fif1++) / --fif2;
        int x = 10 >> 2;
        System.out.println(x);
        System.out.println(fifth);
        //результат 0, так как выполнялись следующие действия:
        //первыми действия выполняются в скобках в следующей очерёдности: умножение, сдвиг. полученное выражение
        //делиться на результат преинкрементного выражения (7). Так как тип данных int, то результатом деления является
        //целоле число ноль без остатка (ручное вычисление дало результат = 0.285)
        System.out.println(" ");
        int sixth1 = 2;
        int sixth2 = 8;
        int sixth = (5 + 7 > 20 ? 68 : 22 * 2 >> sixth1++) / --sixth2;
        System.out.println(sixth);
        // тернарная операция выполнялась следующим образом:
        // если 5+7 > 20 верно, тогда верни мне 68,
        // если условие 5+7 > 20 не верно, возвращается второе значение после : 22 * 2 >> sixth1++
        // в нашем примере условие 5+7 > 20 не верно, и тогда результат выражения 22 * 2 >> sixth1++ делился на 7.
        int seventh1 = 2;
        int seventh2 = 8;
        // int seventh = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> seventh1++) / --seventh2;

        // Ошибка компеляции, так как обе части Ternary operator возвращают выражения разного типа:
        // первая часть тернарной операции тип boolean 68 >= 68, а вторая часть 22 * 2 >> seventh1++ - тип int;

        boolean eight = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(eight);
        // значение переменной получилоль False как результат выполнения логической опреации && (сокращённое И) так как
        // первый операнд имеет значение true, и для получения результата логичексий оператор && вынужден выполнить
        // проверку второго операнда, который у нас false.
        boolean ninth = true && false;
        System.out.println(ninth);
        /// значение переменной получилоль False как результат выполнения логической опреации && (сокращённое И) так как
        // первый операнд имеет значение true, и для получения результата логичексий оператор && вынужден выполнить
        // проверку второго операнда, который у нас false.


    }

    static void Task3Part1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your name!");
        String name1 = in.nextLine();
        if (name1.equals("Vasya")) {
            System.out.println("Hello!\n" + "I`ve been wating for you so long!");
        } else if (name1.equals("Anastaysha") ) {
            System.out.println("I`ve been wating for you so long!");
        } else {
            System.out.println("Hello. Who are you?");
        }
    }
    static void Task3Part2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your name!");
        String name2 = in.nextLine();
        if (!name2.equals("Vasya")&&!name2.equals("Anastaysha")) {
            System.out.println("Hello. Who are you?");
        }
        if (name2.equals("Vasya")) {
            System.out.println("Hello!\n" + "I`ve been wating for you so long!");
        }
        if (name2.equals("Anastaysha") ) {
            System.out.println("I`ve been wating for you so long!");
        }

    }
    static void Task3Part3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your name!");
        String name3 = in.nextLine();
        switch (name3){
            case "Vasya":
                System.out.println("Hello!\n" + "I`ve been waiting for you so long!"); break;
            case "Anastaysha":
                System.out.println("I`ve been waiting for your so long"); break;
            default:
                System.out.println("Hello. Who are you?");
        }
    }

}