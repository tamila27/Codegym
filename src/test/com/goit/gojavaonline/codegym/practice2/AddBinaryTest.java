package com.goit.gojavaonline.codegym.practice2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/19/16.
 */
public class AddBinaryTest {

    @Test
    public void testAdd() throws Exception {
        AddBinary addBinary = new AddBinary();
        Assert.assertEquals("1001", addBinary.add("101", "100"));
    }

    @Test
    public void testAdd2() throws Exception {
        AddBinary addBinary = new AddBinary();
        Assert.assertEquals("1110", addBinary.add("111", "111"));
    }
}