package com.zzx.quickSort;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description
 * @Author zhangzx
 * @Date 2019/9/4 11:09
 * Version 1.0
 **/
public class QuickSort {

    public void quickSort(int[] arr, int left, int right) {
        int i, j, t, temp;
        if (left > right) {//?
            return;
        }
        temp = arr[left];
        i = left;
        j = right;
        while (i != j) {
            // 从右往左找小于基准数的
            while(arr[j] >= temp && i < j) {
                j --;
            }
            // 从左往右找大于基准数的
            while(arr[i] <= temp && i < j) {
                i ++;
            }

            //
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        // 最终将基准位
        arr[left] = arr[i];
        arr[i] = temp;

        quickSort(arr, left, i-1);
        quickSort(arr, i + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
