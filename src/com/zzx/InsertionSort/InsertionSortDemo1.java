package com.zzx.InsertionSort;

/**
 * @ClassName InsertionSortDemo1
 * @Description
 * @Author zhangzx
 * @Date 2019/6/28 11:13
 * Version 1.0
 **/
public class InsertionSortDemo1 {
    private void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i ++) {
            int e = arr[i];
            int j;
            for (j = i; j > 0; j --) {
                if (e < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                }
            }
            arr[j] = e;
        }
    }
}
