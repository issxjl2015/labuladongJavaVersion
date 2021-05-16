package org.issxjl2015.algorithm.Lc_160_相交链表;

import org.issxjl2015.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(0);
        ListNode b3 = new ListNode(1);
        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);


        ListNode headA = new ListNode(-1);
        headA.next = a1;
        headA.next.next = a2;
        headA.next.next.next = c1;
        headA.next.next.next.next = c2;
        headA.next.next.next.next.next = c3;
        ListNode headB = new ListNode(-1);
        headB.next = b1;
        headB.next.next = b2;
        headB.next.next.next = b3;
        headB.next.next.next.next = c1;
        headB.next.next.next.next.next = c2;
        headB.next.next.next.next.next.next = c3;
        Solution solution = new Solution();
        ListNode ans = solution.getIntersectionNode(headA, headB);
        Assert.assertEquals(c1, ans);

        Solution2 solution2 = new Solution2();
        ListNode ans2 = solution2.getIntersectionNode(headA, headB);
        Assert.assertEquals(c1, ans2);
    }

    @Test
    public void test2() {
        ListNode a1 = new ListNode(1);
        ListNode headA = new ListNode(-1);
        headA.next = a1;
        ListNode headB = new ListNode(-1);
        headB.next = a1;
        Solution solution = new Solution();
        ListNode ans = solution.getIntersectionNode(headA, headB);
        Assert.assertEquals(a1, ans);

        Solution2 solution2 = new Solution2();
        ListNode ans2 = solution2.getIntersectionNode(headA, headB);
        Assert.assertEquals(a1, ans2);
    }
}
