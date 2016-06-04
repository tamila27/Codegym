package com.goit.gojavaonline.codegym.practice2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/13/16.
 */
public class SetZeroTest {

    @Test
    public void testSet() throws Exception {
        SetZero setZero = new SetZero();
        Assert.assertEquals(4, setZero.set(6, 2));
    }

    @Test
    public void testSet2() throws Exception {
        SetZero setZero = new SetZero();
        Assert.assertEquals(3, setZero.set(3, 5));
    }

    @Test
    public void testSet3() throws Exception {
        SetZero setZero = new SetZero();
        Assert.assertEquals(0, setZero.set(1, 1));
    }

    @Test
    public void testSet4() throws Exception {
        SetZero setZero = new SetZero();
        Assert.assertEquals(-1073741825, setZero.set(-1, 31));
    }

    @Test
    public void testSet5() throws Exception {
        SetZero setZero = new SetZero();
        Assert.assertEquals(2147483647, setZero.set(-1, 32));
    }
}