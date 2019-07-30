package com.gegaojian;


// 100,000个数据的选择排序
public class Demo2 {

    private static int NUM = 100000;

    public static void main(String[] args) {
        // 生成大小为100,000的随机数组和顺序数组
        int[] randomArray = MyUtil.generateRandomArray(NUM);
        int[] orderedArray = MyUtil.generateOrderedArray(NUM);

        System.out.println("Selection Sort on Random Array: ");
        long startTime = System.currentTimeMillis();
        MyAlgorithm.selectionSort(randomArray);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");

        System.out.println("Selection Sort on Ordered Array: ");
        startTime = System.currentTimeMillis();
        MyAlgorithm.selectionSort(orderedArray);
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");
    }
}
