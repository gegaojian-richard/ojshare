package com.gegaojian;

import java.util.Arrays;

// 快排
public class Demo3 {
    private static int NUM = 100000;

    public static void main(String[] args) {
        // 生成大小为100,000的随机数组和顺序数组
        int[] randomArray = MyUtil.generateRandomArray(NUM);
        int[] orderedArray = MyUtil.generateOrderedArray(NUM);

        System.out.println("DualPivotQuicksort on Random Array with size of " + NUM + " : ");
        long startTime = System.currentTimeMillis();
        Arrays.sort(randomArray);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");

        System.out.println("DualPivotQuicksort on Ordered Array with size of " + NUM + " : ");
        startTime = System.currentTimeMillis();
        Arrays.sort(orderedArray);
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");
    }
}
