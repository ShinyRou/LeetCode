package com.zhujun.sort;

/**
 * className: AbstractSort
 * create by: zhujun
 * description: TODO
 * create time: 2020/3/20 17:23
 */
public abstract class AbstractSort {
    public abstract   int[] sort(int[] array);

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }

    }
}
