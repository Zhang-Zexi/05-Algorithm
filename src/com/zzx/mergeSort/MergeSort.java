package com.zzx.mergeSort;

import com.zzx.InsertionSort.InsertionSort;
import com.zzx.InsertionSort.InsertionSortDemo;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description
 * @Author zhangzx
 * @Date 2019/6/22 16:44
 * Version 1.0
 **/
public class MergeSort {
    private void mergeSort(int arr[], int l, int r) {
        if (l >= r) { // l = r 说明只有一个元素，数据集为空，l > r说明不存在，数据集为空
            return;
        }

        int mid = (l + r) / 2;//找到中间数（分开后左边数组最后一位||l+r其实有溢出的风险）
        mergeSort(arr, 0, mid);
        mergeSort(arr, mid + 1, r);
        if (arr[mid] > arr[mid + 1]) { // 因为arr[mid]<arr[mid + 1]那么arr是有序的
            merge(arr, l, mid, r);
        }
    }

    private void merge(int arr[], int l, int mid, int r) {
        int aux[] = new int[r - l + 1];// 进行合并的时候，需要准备拷贝数组
        for (int i = l; i <= r; i ++) {
            aux[i - l] = arr[i];// 比如8个数字，l就是1，r就是8，复制数组的时候会有偏移量
        }
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k ++) {
            if (i > mid) { // 判断合法性，如果一直是一边插入，可能i就超出了左半部分，这时候肯定只有右边插入,就是j-1
                arr[k] = aux[j - l];
                j ++;
            } else if (j > r) {// 判断合法性，如果一直右边，那么剩下的就只能是左边
                arr[k] = aux[i - l];
                i ++;
            } else if (aux[i - l] < aux[j - l]) {//两个索引，那个值小插入那个
                arr[k] = aux[i - l];
                i ++;
            } else {
                arr[k] = aux[j - l];
                j ++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {12,33,28,86,15,62,9,38};
        MergeSort m = new MergeSort();
        m.mergeSort(arr, 1, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
