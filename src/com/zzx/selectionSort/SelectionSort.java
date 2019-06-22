package com.zzx.selectionSort;

import java.util.Arrays;

/**
 * @ClassName SelectionSort
 * @Description
 * @Author zhangzx
 * @Date 2019/6/22 12:41
 * Version 1.0
 **/
public class SelectionSort {

    private void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i ++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j ++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSort s = new SelectionSort();
        s.selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
