package com.gegaojian;

import java.util.Arrays;

// 归并排序
public class Demo4 {
    public static void main(String[] args) {
        // 生成大小为100,000的随机数组和顺序数组
        int[] randomArray = MyUtil.generateRandomArray(10000);
        int[] orderedArray = MyUtil.generateOrderedArray(10000);

        System.out.println("Merge Sort on Random Array: ");
        long startTime = System.currentTimeMillis();
        Arrays.parallelSort(randomArray);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");

        System.out.println("Merge Sort on Ordered Array: ");
        startTime = System.currentTimeMillis();
        Arrays.parallelSort(orderedArray);
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");
    }
}
