package com.zzx.Heap.MaxHeap;


/**
 * @ClassName MaxHeap
 * @Description
 * @Author zhangzx
 * @Date 2019/6/29 14:21
 * Version 1.0
 **/
public class MaxHeap<E extends Comparable<E>> {
    private Array<E> data;
    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }
}
