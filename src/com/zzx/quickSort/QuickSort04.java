package com.zzx.quickSort;

import java.util.Arrays;

/**
 * @ClassName QuickSort04
 * @Description
 * @Author zhangzx
 * @Date 2019/9/4 15:44
 * Version 1.0
 **/
public class QuickSort04 {

    public void quickSort(int arr[], int left, int right) {
        int i, j, temp ,t;
        if (left > right) {
            return;
        }
        i = left;
        j = right;
        temp = arr[left];

        while (i != j) {
            while (arr[j] >= temp && i < j) {
                j --;
            }
            while (arr[i] <= temp && i < j) {
                i ++;
            }
//            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
//            }
        }
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickSort04 quickSort04 = new QuickSort04();
        quickSort04.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
