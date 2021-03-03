package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_5_双指针技巧套路框架.Lc_876_链表的中间结点;
import org.issxjl2015.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Lc_876_链表的中间结点_test {

    @Test
    public void test1() {
        Lc_876_链表的中间结点 solution = new Lc_876_链表的中间结点();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode ans = solution.middleNode(head);
        Assert.assertEquals(3, ans.val);
    }

    @Test
    public void test2() {
        Lc_876_链表的中间结点 solution = new Lc_876_链表的中间结点();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode ans = solution.middleNode(head);
        Assert.assertEquals(4, ans.val);
    }

}
