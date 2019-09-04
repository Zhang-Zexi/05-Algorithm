package com.zzx.InsertionSort;

import java.util.Arrays;

/**
 * @ClassName InsertionSortDemo05
 * @Description
 * @Author zhangzx
 * @Date 2019/9/3 14:27
 * Version 1.0
 **/
public class InsertionSortDemo05 {

    public void insertionSort(int arr[]) {
        // 从第二个数字和前面的数值比较，如果第二个数字小就交换
        // 然后第三个数字和前面的2个数字比较，如果第三个数字小就交换
        // 以此类推，排出顺序
        int e = 0;
        for (int i = 1; i < arr.length; i++) {
            // 一开始要找位置的数字值
            e = arr[i];
            int j = 0;
            // j的值肯定是大于1的
            for (j = i; j > 0; j --) {
                if (e < arr[j - 1]) {// 如果前面的数字大于比较值e，那么就把前面的数字移动到后面
                    arr[j] = arr[j - 1];
                }
            }
            // 上述移动后，此时的j值就是e应该存在的最小位置
            arr[j] = e;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSortDemo05 insert = new InsertionSortDemo05();
        insert.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
