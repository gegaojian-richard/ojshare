package com.gegaojian;

import java.security.SecureRandom;

public class MyUtil {

    private MyUtil(){}

    public static int[] generateRandomArray(int n) {

        assert n > 0;

        SecureRandom secureRandom = new SecureRandom();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = secureRandom.nextInt();
        return arr;
    }

    public static int[] generateOrderedArray(int n) {

        assert n > 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = i;
        return arr;
    }
}