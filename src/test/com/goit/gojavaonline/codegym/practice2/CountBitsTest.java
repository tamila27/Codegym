package com.goit.gojavaonline.codegym.practice2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/13/16.
 */
public class CountBitsTest {

    @Test
    public void testCount() throws Exception {
        CountBits countBits = new CountBits();
        Assert.assertEquals(3, countBits.count(13));

    }
}