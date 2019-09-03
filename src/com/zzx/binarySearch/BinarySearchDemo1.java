package com.zzx.binarySearch;

/**
 * @ClassName BinarySearchDemo1
 * @Description
 * @Author zhangzx
 * @Date 2019/7/1 14:40
 * Version 1.0
 **/
public class BinarySearchDemo1 {
    private int binarySearch(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
