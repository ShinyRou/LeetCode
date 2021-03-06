package com.zhujun.offer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 **/
public class Question6 {

    public static  int minNumberInRotateArray(int [] array) {
        //基础方法
        if(array.length == 0){
            return 0;
        }
        for(int i=array.length-1;i>0;i--){
            if(array[i]<array[i-1]){
                return array[i];
            }
        }
        return array[1];
    }

    public static int minNumberInRotateArray2(int[] array){
        if(array.length == 0){
            return 0;
        }
        //使用二分法
        int left = 0;
        int right = array.length-1;
        while(left<right-1){
            int mid = (left+right)/2;
            if(array[left]<=array[mid]){
                left = mid;
            }else if(array[left]>array[mid]){
                right= mid;
            }
        }
        return array[right];
    }

    public static void main(String[] args) {
        int[] array = {2,1};
        System.out.println(minNumberInRotateArray2(array));
    }
}
