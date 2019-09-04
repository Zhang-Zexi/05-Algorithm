package com.zzx.InsertionSort;

import com.zzx.selectionSort.SelectionSortDemo05;

import java.util.Arrays;

/**
 * @ClassName InsertionSortDemo02
 * @Description
 * @Author zhangzx
 * @Date 2019/9/3 11:33
 * Version 1.0
 **/
public class InsertionSortDemo02 {

    public void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i ++) {
            int e = arr[i];
            int j = 0;
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
        InsertionSortDemo02 insert = new InsertionSortDemo02();
        insert.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
