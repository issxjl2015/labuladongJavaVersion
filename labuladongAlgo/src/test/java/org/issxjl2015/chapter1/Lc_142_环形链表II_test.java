package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_5_双指针技巧套路框架.Lc_142_环形链表II;
import org.issxjl2015.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Lc_142_环形链表II_test {

    @Test
    public void test1() {
        Lc_142_环形链表II solution = new Lc_142_环形链表II();
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(3);
        head.next = head2;
        ListNode head3 = new ListNode(2);
        head.next.next = head3;
        ListNode head4 = new ListNode(7);
        head.next.next.next = head4;
        ListNode head5 = new ListNode(7);
        head.next.next.next = head5;
        head.next.next.next.next = head3;

        ListNode ans = solution.detectCycle(head);
        Assert.assertEquals(2, ans.val);
    }

    @Test
    public void test2() {
        Lc_142_环形链表II solution = new Lc_142_环形链表II();
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(3);
        head.next = head2;
        head.next.next = head;

        ListNode ans = solution.detectCycle(head);
        Assert.assertEquals(0, ans.val);
    }

}
