package com.zhujun.problems;

/**
 * <p>
 * Description: [
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 * ]
 * </p>
 * Created on 2020/5/25 10:57
 *
 * @author <a href="mailto: "></a> zhujun
 * @version 1.0
 **/
public class FindMedianSortedArrays {
    /**
     * @Description
     * 1.归并排序
     * 2.求中位数
     * 时间复杂度 nlogn
     * @author zhujun
     * @date 2020/5/25 15:14
     * @param nums1
    * @param nums2
     * @return double
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int[] allNums = new int[length];
        int j = 0;
        int i = 0;
        int k = 0;
        while(i<nums1.length || j<nums2.length){
            if(j== nums2.length){
                allNums[k] = nums1[i];
                i++;
                k++;
                continue;
            }else if(i== nums1.length){
                allNums[k] = nums2[j];
                j++;
                k++;
                continue;
            }
            if(nums1[i]<=nums2[j]){
                allNums[k] = nums1[i];
                i++;
                k++;
            }else if(nums1[i]>=nums2[j]) {
                allNums[k] = nums2[j];
                j++;
                k++;
            }
        }

        for(Integer num:allNums){
            System.out.println(num);
        }
        double middle = 0;
        if(length%2==0){
            middle = (double) (allNums[length/2]+allNums[length/2-1])/2;
        }else{
            middle = allNums[length/2];
        }
        return middle;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,4,56,99};
        int[] nums2 = {2,5,67,188,255};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}


