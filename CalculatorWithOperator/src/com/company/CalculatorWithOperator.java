package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalculatorWithOperator {
    public BigDecimal Sum (BigDecimal a, BigDecimal b ) {

        return a.add(b);
    }
    public BigDecimal Sub (BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }
    public BigDecimal Mult (BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
    public BigDecimal Divis (BigDecimal  a, BigDecimal  b) {
        return a.divide(b);
    }
    public BigDecimal Invol (BigDecimal baseA, int exponentB){
        return baseA.pow(exponentB);
    }
    public BigDecimal abslNum (BigDecimal a, BigDecimal b) {
        return a.abs();
    }
    public BigDecimal squareRoot (BigDecimal  a){
        return new BigDecimal (Math.sqrt(a.doubleValue()));
    }

}
