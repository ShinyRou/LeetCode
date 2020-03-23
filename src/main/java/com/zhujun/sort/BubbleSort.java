package com.zhujun.sort;

/**
 * className: BubbleSort
 * create by: zhujun
 * description:
 * 冒泡排序
 * create time: 2020/3/20 14:09
 */
public class BubbleSort extends AbstractSort{
    public static void main(String[] args) {
        int[] array = {212,323,1,3,12316,56,43,66,78};
        System.out.println("排序前");
        printArray(array);
        System.out.println("\n排序后");
        printArray(new BubbleSort().sort(array));

    }

    @Override
    public  int[] sort(int[] array){

        boolean isSwap = false;
        /*冒泡 排序思想
         *一趟排序 确定出 数组中最大的一个数 放在最右边 总共n-1趟
         * 每趟中 从第0个元素开始 两两比较 大的放在右边  到n-1-i个
         */
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int t =array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                    isSwap =true;
                }
            }
            if(!isSwap){
                return array;
            }
        }

        return array;
        //算法时间复杂度 O(n^2)
    }


}
