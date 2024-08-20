package com.vivek.largenumbers;

import java.math.BigInteger;

public class Big_Integer {
    public static void main(String[] args) {
        int a=30;
        int b=67;

        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(586532965);
        int c=B.intValue();

        BigInteger C=new BigInteger("234548951252536");
        System.out.println(C);

        BigInteger D=BigInteger.TEN;
//        System.out.println(D);

        BigInteger sum=A.add(B);
        System.out.println(sum);

        BigInteger mul=C.multiply(D);
        System.out.println(mul);

        BigInteger sub=C.subtract(D);
        System.out.println(sub);

        BigInteger div=C.divide(D);
        System.out.println(div);

        BigInteger rem=C.remainder(D);
        System.out.println(rem);

        if (C.compareTo(D)>0){
            System.out.println(C.compareTo(D));
        }

        System.out.println(Factorial.fact(500));
    }
}
