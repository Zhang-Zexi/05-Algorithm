package com.zzx.bubble;

import java.util.Arrays;

/**
 * @ClassName BubbleSortDemo3
 * @Description
 * @Author zhangzx
 * @Date 2019/9/2 17:26
 * Version 1.0
 **/
public class BubbleSortDemo3 {

    public void bubbleSort(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length - 1; i ++) {
            for (int j = 0; j < arr.length - i - 1; j ++) {
                if (arr[j] > arr[j + 1]) {
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSortDemo3 demo = new BubbleSortDemo3();
        demo.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
