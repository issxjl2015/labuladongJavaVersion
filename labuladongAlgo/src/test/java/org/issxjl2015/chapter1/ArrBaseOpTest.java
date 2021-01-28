package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp.ArrBaseOp;
import org.junit.Test;

public class ArrBaseOpTest {

    @Test
    public void test1() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        ArrBaseOp arrBaseOp = new ArrBaseOp();
        // 数组遍历框架
        arrBaseOp.traverse(arr);
    }
}
