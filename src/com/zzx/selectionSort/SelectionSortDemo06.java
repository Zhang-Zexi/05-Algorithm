package com.zzx.selectionSort;

import java.util.Arrays;

/**
 * @ClassName SelectionSortDemo06
 * @Description 选择排序算法
 * @Author zhangzx
 * @Date 2019/9/3 14:09
 * Version 1.0
 **/
public class SelectionSortDemo06 {

    public void selectionSort(int arr[]) {
        int minIndex = 0;
        int temp = 0;
        // 第一次轮比较是从1开始，第二轮是2开始
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;//minIndex表明本轮的最小的数值索引是多少
            //每轮比较中，拿第二个数个第一个数进行比较，第二个数比第一个数小就变为最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 把找出的最小值交换到最前面的位置
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            // 第一轮比较找出第一个最小值
            //第二轮比较找出从2开始的最小值
            //以此类推进行排序
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSortDemo06 s = new SelectionSortDemo06();
        s.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
