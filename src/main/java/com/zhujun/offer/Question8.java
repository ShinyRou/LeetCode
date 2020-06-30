package com.zhujun.offer;

/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 **/
public class Question8 {
    public static  int JumpFloor(int target) {
        //这种题目  记得找规律
        //1 台阶 1 种
        //2 台阶 2 种  11  21
        //3 台阶 3 种 111  12  21
        //4 台阶 5种 1111 121 112 211 22
        //也还是斐波那契数列  不同的是 f(0) = 1
        if(target==0 ){
            return 1;
        }else if(target==1){
            return 1;
        }else{
            return  JumpFloor(target-1)+JumpFloor(target-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(4));
    }
}
