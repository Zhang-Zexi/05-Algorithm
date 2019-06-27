package com.zzx.selectionSort;

import java.util.Arrays;

/**
 * @ClassName SelectionSort
 * @Description
 * @Author zhangzx
 * @Date 2019/6/27 17:33
 * Version 1.0
 **/
public class SelectionSort {
    private void selectionSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i ++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSort s = new SelectionSort();
        s.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
