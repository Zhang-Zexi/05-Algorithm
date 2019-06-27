package com.zzx.InsertionSort;

import java.util.Arrays;

/**
 * @ClassName InsertionSortDemo
 * @Description
 * @Author zhangzx
 * @Date 2019/6/22 14:10
 * Version 1.0
 **/
public class InsertionSortDemo {

    public static void insertSort(int arr[], int n) {
        for (int i = 1; i < n; i ++) {
            int e = arr[i]; // 排序到的位置
            int j;
            for (j = i; j > 0; j --) {
                if (e < arr[j - 1]) { // 如果当前位置元素比前面的数字小
//                    int temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
                    arr[j] = arr[j - 1];// 把前面数字的值赋值到当前位置，等于向后移动一位
                }
            }
            arr[j] = e;// 此时j的值就是当前位置值要在的索引
        }

    }

}
