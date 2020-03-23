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
         *  插入排序
         *  从数组下标为1开始遍历
         *  数组左边是排好序的，确定每个元素要插入的位置
         *     1.左边相邻两个元素交换位置
         *     2.左边元素挨个后移
         */
        for(int i = 1;i<array.length;i++){
            int j = i;
            //内层循环 从当前元素开始向左比较 两两交换
            /*while(j>0&&array[j]<array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }*/
            //内层循环从当前元素比较 大的元素向右移位 减少了数组访问次数
            int temp = array[j];
            while(j>0&&temp<array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j]=temp;
        }
        return array;
    }


}
