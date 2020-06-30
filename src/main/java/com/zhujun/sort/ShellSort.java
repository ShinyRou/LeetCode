package com.zhujun.sort;

/**
 * className: ShellSort
 * create by: zhujun
 * description: 希尔排序
 *
 * 思想：基于插入排序的一种优化，对与数组本身就部分有序的效率比较高。
 * gap = gap*3 + 1    gap<array.length
 * 从最大值开始
 * 使得 数组 没间隔 gap个是有序的
 * gap最后=1 进行一次扫描进行插入排序。
 *
 * 希尔排序的性能取决于h的递增序列，上面代码中所用的递增序列并不是最优秀的，但最坏情况下的运行时间仍少于平方级别，算法的时间复杂度为O（n^(2/3)）。
 *
 * create time: 2020/3/23 10:55
 */
public class ShellSort  extends AbstractSort{
    public static void main(String[] args) {
        int[] array = {212,323,1,3,12316,56,43,66,78};
        System.out.println("排序前");
        printArray(array);
        System.out.println("\n排序后");
        printArray(new ShellSort().sort(array));
    }


    @Override
    public int[] sort(int[] array) {
        int gap = 1;
        //获取最大的gap值
        while(gap*3+1<=array.length){
            gap = gap*3+1;
        }

        while(gap>0){
            for(int i=0;i<array.length-gap;i=i+gap){
                //与插入排序操作相同
                //元素两两交换
                /*int j = i+gap;
                while(j>0&&array[j]<array[j-gap]){
                    int temp = array[j];
                    array[j] = array[j-gap];
                    array[j-gap]=temp;
                    j-=gap;
                }*/

                //后移操作
                int j =i;
                int temp = array[j+gap];
                while(j>=0&&array[j]>temp){
                    array[j+gap] = array[j];
                    j-=gap;
                }
                array[j+gap] = temp;//空位置插入 temp
            }
            gap =(int) Math.floor(gap/3);
        }
        return array;
    }
}
