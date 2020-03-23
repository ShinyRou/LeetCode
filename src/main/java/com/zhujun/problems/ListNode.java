package com.zhujun.problems;

/**
 * className: ListNode
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 11:34
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static void main(String[] args) {
        demo(1,null);
        //int a = 10;Long b = a.longValue(); 自动拆箱 空指针
    }

    public static  boolean demo(int a,Long b){
        if(a==b){
            return false;
        }else{
            return true;
        }
    }
}
