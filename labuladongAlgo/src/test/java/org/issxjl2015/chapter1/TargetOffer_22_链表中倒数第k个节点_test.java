package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_5_双指针技巧套路框架.TargetOffer_22_链表中倒数第k个节点;
import org.issxjl2015.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TargetOffer_22_链表中倒数第k个节点_test {

    @Test
    public void test1() {
        TargetOffer_22_链表中倒数第k个节点 solution = new TargetOffer_22_链表中倒数第k个节点();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode ans = solution.getKthFromEnd(head, k);

        Assert.assertEquals(4, ans.val);
        Assert.assertEquals(5, ans.next.val);
    }

}
