package com.zzx.bubble;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] sortNum){
        int temp = 0;
        for(int i = 0; i < sortNum.length-1; i++) {
//            排序要走多少趟
            for(int j = 0; j < sortNum.length-1-i; j++) {
//                每趟要走的次数
                if (sortNum[j+1] < sortNum[j]) {
//                    大的排在后面
                    temp = sortNum[j];
                    sortNum[j] = sortNum[j+1];
                    sortNum[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] sortNum = {12,33,28,86,15,62,9,38};

        bubbleSort(sortNum);

        System.out.println(Arrays.toString(sortNum));

    }



}
