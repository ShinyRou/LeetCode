package com.zhujun.offer;

import java.util.Stack;

/**
 *用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 **/
public class Question5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public  void push(int node) {
        stack1.clear();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
       stack1.push(node);
       stack2.clear();
       while(!stack1.empty()){
           stack2.push(stack1.pop());
       }

    }

    public int pop() {
      return  stack2.pop();
    }

    public static void main(String[] args) {
        Question5 q = new Question5();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
