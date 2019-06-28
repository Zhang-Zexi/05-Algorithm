package com.zzx.selectionSort;

/**
 * @ClassName SelectionSortDemo3
 * @Description
 * @Author zhangzx
 * @Date 2019/6/28 11:36
 * Version 1.0
 **/
public class SelectionSortDemo3 {
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

}
