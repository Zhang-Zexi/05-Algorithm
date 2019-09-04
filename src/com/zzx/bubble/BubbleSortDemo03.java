package com.zzx.bubble;

import java.util.Arrays;

/**
 * @ClassName BubbleSortDemo03
 * @Description
 * @Author zhangzx
 * @Date 2019/9/2 17:39
 * Version 1.0
 **/
public class BubbleSortDemo03 {

    public void bubbleSort(int[] arr) {
        int x = 0;
        // 比较的轮数是arr.length-1
        for (int i = 0; i < arr.length - 1; i++) {
            // 每轮比较的次数是arr.length-i-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 交换
                if (arr[j] > arr[j + 1]) {
                    x = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSortDemo03 b = new BubbleSortDemo03();
        b.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
