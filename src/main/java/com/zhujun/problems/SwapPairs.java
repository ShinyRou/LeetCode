package com.zhujun.problems;

/**
 * className: SwapPairs
 * create by: zhujun
 * description:
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * 思路
 * create time: 2019/3/12 11:33
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode next2 = null;
        head= head.next;
        while(current!=null&&current.next!=null){
           next = current.next;
           next2 = next.next;
           next.next = current;
           current.next = current;
           current = next2;
        }
        return head;
    }
}
