package com.zhujun.sort;

/**
 * className: SelectionSort
 * create by: zhujun
 * description: 选择排序
 * create time: 2020/3/20 14:28
 */
public class SelectionSort extends AbstractSort{
    public static void main(String[] args) {
        int[] array = {212,323,1,3,12316,56,43,66,78};
        System.out.println("排序前");
        printArray(array);
        System.out.println("\n排序后");
        printArray(new SelectionSort().sort(array));

    }

    @Override
    public  int[] sort(int[] array){
        /**
         * 选择排序
         * 从第零个元素开始 依次与后续每个元素比较 直到最后一个 最小的与a[0]交换
         * 总共需要 0到n-2次
         * 内层 用来与i比较的元素 ++ 直到 a[n-1]
         */
        for(int i=0;i<array.length-1;i++){
            int min = i; //默认最小为开始的i
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            //互换 i min的位置  记录的是下标
            int t =array[min];
            array[min] = array[i];
            array[i] = t;
        }
        return array;
    }


}
