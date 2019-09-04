package com.zzx.InsertionSort;

import java.util.Arrays;

/**
 * @ClassName InsertionSortDemo04
 * @Description
 * @Author zhangzx
 * @Date 2019/9/3 11:58
 * Version 1.0
 **/
public class InsertionSortDemo04 {

    public void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i ++) {
            int e = arr[i];
            int j = 0;
            for (j = i; j > 0; j --) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSortDemo04 insert = new InsertionSortDemo04();
        insert.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
