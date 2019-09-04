package com.zzx.InsertionSort;

import java.util.Arrays;

/**
 * @ClassName InsertionSort06
 * @Description
 * @Author zhangzx
 * @Date 2019/9/4 14:45
 * Version 1.0
 **/
public class InsertionSort06 {

    public void insertionSort(int[] arr) {
        int e;
        for (int i = 1; i < arr.length; i++) {
            e = arr[i];
            int j;
            for (j = i; j > 0; j --) {
                if (e < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                }
            }
            arr[j] = e;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSort06 insert = new InsertionSort06();
        insert.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
