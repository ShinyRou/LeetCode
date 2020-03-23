package com.zhujun.problems;

/**
 * className: IsPalindrome
 * create by: zhujun
 * description: 是否是回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 1.将整个数反转
 * 2.讲数的一半反转 与另一半比较
 * create time: 2019/3/22 17:39
 */
public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int defaultX=x;
        int y=0;
        int reverseNum=0;
        while(x!=0){
            y=x%10;
            x=x/10;
            reverseNum=reverseNum*10+y;
        }
        System.out.println("reverseNum:"+reverseNum);
        if(reverseNum==defaultX){
            return true;
        }else{
            return false;
        }

    }


    public static boolean isPalindrome2(int x){
        if(x<0||(x % 10 == 0 && x != 0)){
            return false;
        }else{
            //如何判断反转到了一半 未反转部分 <以反转部分*10
            int reverseNum=0;
            int y=0;
            while(x>(reverseNum*10)){
                y= x%10;
                reverseNum = reverseNum*10+y;
                x=x/10;
            }
            System.out.println(reverseNum);
            return x == reverseNum || x == reverseNum/10;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome2(101));
    }
}
