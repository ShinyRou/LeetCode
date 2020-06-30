package com.zhujun.offer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 **/
public class Question1 {
    public static boolean Find(int target, int [][] array) {
        int i = array.length;
        if(i==0){
            return false;
        }
        int j = array[0].length;
        int line = 0;
        int row = j-1;
        //从右上角开始 比较
        while(row>=0&&line<i){
            if(array[line][row]>target){
                //前一列
                row--;
                continue;
            }else if(array[line][row]<target){
                //下一行
                line++;
                continue;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array =  {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13},{6,8,11,15}};
        System.out.println(Find(7,array));
    }
}
