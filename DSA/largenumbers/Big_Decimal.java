package com.vivek.largenumbers;

import java.math.BigDecimal;

public class Big_Decimal {
    public static void main(String[] args) {
        BigDecimal X = new BigDecimal("614834.621");
        BigDecimal Y = new BigDecimal("648163.4168");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);

        System.out.println(Y.add(X));
        System.out.println(Y.multiply(X));
        System.out.println(X.pow(2));
        System.out.println(X.negate());

        BigDecimal ten = BigDecimal.TEN;
        System.out.println(ten);
    }
}
