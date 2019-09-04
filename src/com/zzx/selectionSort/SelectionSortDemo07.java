package com.zzx.selectionSort;

import java.util.Arrays;

/**
 * @ClassName SelectionSortDemo07
 * @Description
 * @Author zhangzx
 * @Date 2019/9/4 14:32
 * Version 1.0
 **/
public class SelectionSortDemo07 {

    public void selectionSort(int arr[]) {
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {
                // 改进了之前的代码，为什么非要先把最小值变为j，再交换呢
                // 为什么不直接交换
                // 现在改为了直接交换
                if (arr[minIndex] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSortDemo07 s = new SelectionSortDemo07();
        s.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
