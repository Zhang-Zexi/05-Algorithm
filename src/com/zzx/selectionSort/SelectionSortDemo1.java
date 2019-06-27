package com.zzx.selectionSort;

import java.util.Arrays;

/**
 * @ClassName SelectionSortDemo1
 * @Description
 * @Author zhangzx
 * @Date 2019/6/27 17:22
 * Version 1.0
 **/
public class SelectionSortDemo1 {
    private void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i ++) {
            int mixIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[mixIndex]) {
                    mixIndex = j;
                }
            }
            int temp = arr[mixIndex];
            arr[mixIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSortDemo1 s = new SelectionSortDemo1();
        s.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
