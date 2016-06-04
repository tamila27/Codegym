package com.goit.gojavaonline.codegym.practice3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/20/16.
 */
public class BinaryHeapTest {

    @Test
    public void testInsert() throws Exception {

    }

    @Test
    public void testPoll() throws Exception {
        BinaryHeap binaryHeap = new BinaryHeap(4);
        binaryHeap.insert(0);
        binaryHeap.insert(3);
        binaryHeap.insert(2);
        binaryHeap.insert(1);


        Assert.assertEquals(3, binaryHeap.poll());

    }
}