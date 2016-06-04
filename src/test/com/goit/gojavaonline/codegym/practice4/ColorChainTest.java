package com.goit.gojavaonline.codegym.practice4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/20/16.
 */
public class ColorChainTest {

    @Test
    public void testCount() throws Exception {
        ColorChain colorChain = new ColorChain();
        Assert.assertEquals(1, colorChain.count(1));
    }
}