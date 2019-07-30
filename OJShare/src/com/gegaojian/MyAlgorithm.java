package com.gegaojian;

public class MyAlgorithm {
    // 选择排序
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i < n ; i ++){
            int minIndex = i;
            for( int j = i + 1 ; j < n ; j ++ )
                if(arr[j] < arr[minIndex])
                    minIndex = j;

            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
