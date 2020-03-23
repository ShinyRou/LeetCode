package com.zhujun.problems;

/**
 * className: ReverseList
 * create by: zhujun
 * description:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 思路：当前节点的下一节点，指向当前节点的前驱
 * create time: 2019/3/12 11:21
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode current = head;
        ListNode pre = null;
        while(current!=null){
            next = current.next;
            current.next = pre;

            pre = current;
            current = next;

        }
        return current;
    }

}

