package com.zhujun.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 **/
public class Question3 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        while(listNode!=null){
            stack.push(listNode);
            listNode = listNode.next;
        }

        while(!stack.empty()){
            ListNode pop = stack.pop();
            result.add(pop.val);
        }
        return result;
    }

    /**
     * @Description  递归实现
     * @author zhujun
     * @date 2020/6/17 14:45
     * @param listNode
     * @return java.util.ArrayList<java.lang.Integer>
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        addToArrayList(listNode,result);
        return result;
    }


    public void addToArrayList(ListNode listNode,ArrayList<Integer> result){
        if(listNode!=null) {
            addToArrayList(listNode.next, result);
            result.add(listNode.val);
        }

    }
}
