package com.zhujun.sort;

/**
 * className: MergeSort
 * create by: zhujun
 * description:
 * 归并排序:
 * 思想 将数组一分为二 左右两个数组分别有序 然后借助辅助数组进行合并
 * 1，实现 合并两个有序数组 到一个大数组
 * 2. 递归将数组分成两份 直到 头尾指针相等
 * create time: 2020/3/27 14:45
 */
public class MergeSort  extends  AbstractSort{

    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }

    public static int[] sort(int[] array,int start,int end){
        if(end<= start)	return new int[]{array[end]};
        int mid = (start + end) / 2;
        return  merge(sort(array, start, mid),sort(array, mid + 1, end));

    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] allNums = new int[length];
        int j = 0;
        int i = 0;
        int k = 0;
        while (i < nums1.length || j < nums2.length) {
            if (j == nums2.length) {
                allNums[k] = nums1[i];
                i++;
                k++;
            } else if (i == nums1.length) {
                allNums[k] = nums2[j];
                j++;
                k++;
            } else if (nums1[i] <= nums2[j]) {
                allNums[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] >= nums2[j]) {
                allNums[k] = nums2[j];
                j++;
                k++;
            }
        }
        return allNums;
    }

    public static void main(String[] args) {
        int[] array = {12,323,4,2,121,23,4,4,0};
        printArray(sort(array,0,array.length-1));

    }
}
