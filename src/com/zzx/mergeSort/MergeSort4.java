package com.zzx.mergeSort;

import java.util.Arrays;

/**
 * @ClassName MergeSort4
 * @Description
 * @Author zhangzx
 * @Date 2019/6/28 14:25
 * Version 1.0
 **/
public class MergeSort4 {
    private void mergeSort(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private void merge(int arr[], int l, int mid, int r) {
        int[] aux = new int[r - l + 1];
        for (int i = l; i <= r; i ++) {
            aux[i - l] = arr[i];
        }
        int i = l;
        int j = mid + 1;
        for (int k = l; k <= r; k ++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j ++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i ++;
            } else if (aux[i - l] < aux[j - l]) {
                arr[k] = aux[i - l];
                i ++;
            } else {
                arr[k] = aux[j - l];
                j ++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,33,28,86,15,62,9,38};
        MergeSort4 m = new MergeSort4();
        m.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
