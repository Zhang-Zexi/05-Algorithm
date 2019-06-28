package com.zzx.quick;

import java.util.Arrays;

/**
 * @ClassName QuickSortDemo3
 * @Description
 * @Author zhangzx
 * @Date 2019/6/28 16:28
 * Version 1.0
 **/
public class QuickSortDemo3 {
    private void quickSort(int arr[], int l, int r) {
        int i, j, temp ,t;
        if (l > r) {
            return;
        }
        i = l;
        j = r;
        temp = arr[l];
        while (i != j) {
            while (arr[j] >= temp && i < j) {
                j --;
            }
            while (arr[i] <= temp && i < j) {
                i ++;
            }
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[l] = arr[i];
        arr[i] = temp;

        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5};
        QuickSortDemo3 q = new QuickSortDemo3();
        q.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
