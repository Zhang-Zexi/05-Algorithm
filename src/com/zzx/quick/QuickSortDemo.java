package com.zzx.quick;

import java.util.Arrays;

/**
 * @ClassName QuickSortDemo
 * @Description
 * @Author zhangzx
 * @Date 2019/6/28 15:48
 * Version 1.0
 **/
public class QuickSortDemo {
    private void quickSort(int arr[], int l, int r) {
        int i, j, t, temp;
        if (l > r) {// 防止数组为NULL的情况
            return;
        }
        temp = arr[l]; // 基准数
        i = l;
        j = r;
        while (i != j) { // i = j 说明只有一个元素，不需要排序
            // 必须从右往前找
            // 先找到一个比基准数小的
            while (arr[j] >= temp && i < j) {
                j --;
            }
            // 左边到右边
            while (arr[i] <= temp && i < j) {
                i ++;
            }
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[l] = arr[i]; //碰头了
        arr[i] = temp;

        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5};
        QuickSortDemo q = new QuickSortDemo();
        q.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
