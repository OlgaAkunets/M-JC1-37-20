package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	CalculatorWithOperator myCalculator = new CalculatorWithOperator();
	//4.1 + 15 * 7 + (28 / 5) ^ 2
        BigDecimal divisResult=myCalculator.Divis (new BigDecimal("28"),new BigDecimal("5"));{
	    System.out.println(divisResult);
	   }
        BigDecimal involResult=myCalculator.Invol(divisResult, 2);{
            System.out.println(involResult);
       }
        BigDecimal multResult=myCalculator.Mult(new BigDecimal("15"), new BigDecimal("7"));{
            System.out.println(multResult);
       }
        BigDecimal sumResult1=myCalculator.Sum(new BigDecimal("4.1"), multResult);{
            System.out.println(sumResult1);
       }
        BigDecimal sumResult2=myCalculator.Sum(sumResult1, involResult);{
            System.out.println(sumResult2);
        }
    }

}
