package com.zzx.selectionSort;

import java.util.Arrays;

/**
 * @ClassName SelectionSortDemo04
 * @Description
 * @Author zhangzx
 * @Date 2019/9/3 10:29
 * Version 1.0
 **/
public class SelectionSortDemo04 {

    public void selectionSort(int arr[]) {
        int temp = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i ++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[i]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSortDemo04 s = new SelectionSortDemo04();
        s.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
