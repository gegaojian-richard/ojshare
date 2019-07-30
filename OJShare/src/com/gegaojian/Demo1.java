package com.gegaojian;

import java.math.BigInteger;

// 数据规模演示
public class Demo1 {

    public static void main(String[] args) {
        for( int x = 1 ; x <= 9 ; x ++ ){

            int n = (int)Math.pow(10, x);

            long startTime = System.currentTimeMillis();

            BigInteger sum = BigInteger.ONE;
            for( int i = 0 ; i < n ; i ++ ) {
                sum = sum.add(BigInteger.valueOf(i));
            }

            long endTime = System.currentTimeMillis();

            System.out.println("n = " + n);
            System.out.println("sum = " + sum);
            System.out.println("10^" + x + " : " + (endTime - startTime) + " ms");
            System.out.println("");
        }
    }
}
