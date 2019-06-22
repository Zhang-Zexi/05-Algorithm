package com.zzx.InsertionSort;

/**
 * @ClassName InsertionSort
 * @Description
 * @Author zhangzx
 * @Date 2019/6/22 14:10
 * Version 1.0
 **/
public class InsertionSort {

    private  void insertSort(int arr[], int n) {
        for (int i = 1; i < n; i ++) {
            for(int j = i; j > 0; j --) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
