package com.zzx.bubble;

import java.util.Arrays;

/**
 * @ClassName BubbleSortDemo04
 * @Description
 * @Author zhangzx
 * @Date 2019/9/4 15:12
 * Version 1.0
 **/
public class BubbleSortDemo04 {

    public void bubbleSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i ++) {
            for (int j = 0; j < arr.length - 1 - i; j ++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSortDemo04 b = new BubbleSortDemo04();
        b.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
