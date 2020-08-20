package com.zhujun.sort;

/**
 * className: QuickSort
 * create by: zhujun
 * description: 快速排序
 *
 * 分治的思想
 * 随机选取一个中心轴，一趟循环 完成 左侧所有数 小于中心轴，右侧所有数 大于中心轴
 * 挖坑的概念
 *
 * 首位 两个位置下标 分别为 左右指针
 * 以第一个数为中心轴，array[0]空出，  右侧指针遍历 直到一个数array[j]小于中心轴,
 * 赋值给array[0],array[j]空出，左指针遍历 直到找到一个 比中心轴大的数 array[i]
 * array[i]的值赋值给array[j]
 * 直到左右指针重合  中心轴的值 赋值给重合时的下标 a[k]
 *
 *
 * create time: 2020/3/20 17:09
 */
public class QuickSort {
    public static void main(String[] args) {
        /*List data = new ArrayList();
        data.add(1);
        System.out.println(data.get(0));*/
        Integer[] integers = new Integer[]{54,23,434,1,32,3,676,87};
        traversal(integers);
        sort(integers,0,7);
        System.out.println("排序后：");
        traversal(integers);
    }
    public static void sort(Integer[] integers,int i,int j){
        int left = i;
        int right = j;
        int pivot = integers[left];//中心轴
        if(i<j){
            while(left<right){
                while(left<right&&integers[right]>=pivot){
                    right--;
                    //右指针找到比中心轴 小的数
                }
                if(left<right){
                    //赋值到 左指针
                    integers[left++] = integers[right];
                }
                while(left<right&&integers[left]<pivot){
                    //左指针找到比中心轴 大的数
                    left++;
                }
                if(left<right){
                    integers[right--] = integers[left];
                }
            }
            integers[left]=pivot;//左右下标重合 中心轴值赋值给 重合位置
            sort(integers,i,left-1);
            sort(integers,right+1,j);
        }
    }

    public static void traversal(Integer[] integers){
        for(Integer it:integers){
            System.out.print(it+",");
        }
    }
}
