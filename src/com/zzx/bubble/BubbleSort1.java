package com.zzx.bubble;

import java.util.Arrays;

/**
 * @ClassName BubbleSort1
 * @Description
 * @Author zhangzx
 * @Date 2019/6/21 16:29
 * Version 1.0
 **/

// 练习Demo
public class BubbleSort1 {

    private void bubbleSort1(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = 0; j < nums.length - 1 - i; j ++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] sortNum = {12,33,28,86,15,62,9,38};
        BubbleSort1 b = new BubbleSort1();
        b.bubbleSort1(sortNum);
        System.out.println(Arrays.toString(sortNum));
    }
}
