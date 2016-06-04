package com.goit.gojavaonline.codegym.practice5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/24/16.
 */
public class KmpSmallestPeriodTest {

    @Test
    public void testFindSmalletstPeriod() throws Exception {
        KmpSmallestPeriod kmpSmallestPeriod = new KmpSmallestPeriod();
        Assert.assertEquals("abc", kmpSmallestPeriod.findSmalletstPeriod("abcabcabc"));

    }

    @Test
    public void testFindSmalletstPeriod2() throws Exception {
        KmpSmallestPeriod kmpSmallestPeriod = new KmpSmallestPeriod();
        Assert.assertEquals("ab", kmpSmallestPeriod.findSmalletstPeriod("abababa"));

    }
}