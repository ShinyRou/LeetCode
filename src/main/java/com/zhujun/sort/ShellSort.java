package com.zhujun.sort;

/**
 * className: ShellSort
 * create by: zhujun
 * description: 希尔排序
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
