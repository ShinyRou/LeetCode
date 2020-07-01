package com.zhujun.offer;


import java.util.LinkedList;


/**
 *输入一个整数，输出该数二进制表示中1的个数。
 * 其中负数用补码表示。
 **/
public class Question11 {
    public static int NumberOf1(int n) {
        if (n == 0){
            return 0;
        }else if(n> 0){
            int sum = 0;
            //原码 十进制转二进制
            while(n!=0){
                int i = n%2;
                if(i==1){
                    sum++;
                }
                n = n/2;
            }
            return  sum;
        }else{
            //负数 使用补码表示
            int sum = 0;
            //原码
            LinkedList<Integer> code = new LinkedList<>();
            n = -n ;
            while(n!=0){
                int i = n%2;
                code.addFirst(i);
                n = n/2;
            }
            //int 类型4字节 32为表示 原码高位补0
            while(code.size()<32){
                code.addFirst(0);
            }
            //取反码
            for(int i=0;i<code.size();i++){
                if(code.get(i).intValue()==0){
                    code.set(i,1);
                }else if(code.get(i).intValue()==1){
                    code.set(i,0);
                }
            }
            //取补码
            add(code,code.size()-1);
            for(int i=0;i<code.size();i++){
                 if(code.get(i).intValue()==1){
                    sum++;
                }
            }
            return sum;
        }
    }
    public static void add(LinkedList<Integer> list,int i){
        if(list.get(i)==0){
            list.set(i,1);
        }else{
            list.set(i,0);
            if(i==0){
                list.addFirst(1);
                return;
            }
            add(list,i-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-1));


        ljlijlij
    }


}
