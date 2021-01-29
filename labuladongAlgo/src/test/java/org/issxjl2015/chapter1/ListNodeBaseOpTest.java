package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp.ListNodeBaseOp;
import org.issxjl2015.common.ListNode;
import org.junit.Test;

public class ListNodeBaseOpTest {
    @Test
    public void test1() {
        ListNodeBaseOp listNodeBaseOp = new ListNodeBaseOp();
        ListNode head = new ListNode(0);      //创建首节点
        ListNode nextNode;                       //声明一个变量用来在移动过程中指向当前节点
        nextNode = head;                         //指向首节点

        //创建链表
        for(int i=1;i<10;i++){
            ListNode node = new ListNode(i);    //生成新的节点
            nextNode.next = node;               //把心节点连起来
            nextNode = nextNode.next;           //当前节点往后移动
        } //当for循环完成之后 nextNode指向最后一个节点，
        listNodeBaseOp.traverse(head);
    }
}
