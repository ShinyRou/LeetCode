package com.zhujun.sort;

/**
 * className: InsertionSort
 * create by: zhujun
 * description: 插入排序
 * create time: 2020/3/20 17:22
 */
public class InsertionSort extends AbstractSort{
    public static void main(String[] args) {
        int[] array = {212,323,1,3,12316,56,43,66,78};
        System.out.println("排序前");
        printArray(array);
        System.out.println("\n排序后");
        printArray(new InsertionSort().sort(array));

    }


    public  int[] sort(int[] array){
        /**
         *
         */
        return array;
    }


}
