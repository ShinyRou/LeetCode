package com.zhujun.offer;

/**
 * <p>
 * Description: []
 * </p>
 * Created on 2020/7/10 14:40
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的
 * 后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 **/
public class Question13 {
    public  static void reOrderArray(int [] array) {
        int length = array.length;
        for(int i=0;i<length;i++){
           if(array[i]%2 == 0){
               int j = i;
               int value = array[i];
               while(j<array.length-1){
                   array[j]=array[j+1];
                   j++;
               }
               array[j]=value;
               length--;
               i--;
           }

        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        int array[] = new int[]{1,2,4,5,6,7,8,9};
        reOrderArray(array);

    }
}
