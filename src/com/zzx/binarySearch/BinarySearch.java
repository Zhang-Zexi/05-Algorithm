package com.zzx.binarySearch;

/**
 * @ClassName BinarySearch
 * @Description
 * @Author zhangzx
 * @Date 2019/6/29 15:24
 * Version 1.0
 **/
public class BinarySearch {
   private int binarySearch(int[] arr, int n, int target) {
       int l = 0;
       int r = n - 1;
       while (l <= r) {
//           int mid = (l + r) / 2;// l + r 可能会有溢出问题
           int mid = l + (r - l) / 2;
           if (arr[mid] == target) {
               return mid;
           }
           if (target < arr[mid]) {
               r = mid - 1;
           } else {
               l = mid + 1;
           }
       }
       return -1;
   }

}
