package com.goit.gojavaonline.codegym.practice3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/19/16.
 */
public class LongestStabilityPeriodTest {

    @Test
    public void testCount() throws Exception {
        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();
        Assert.assertEquals(2, longestStabilityPeriod.count(new int[]{900, 901, 902}));

    }

    @Test
    public void testCount1() throws Exception {
        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();
        Assert.assertEquals(4, longestStabilityPeriod.count(new int[]{900, 900, 900, 901, 902, 902, 903, 903}));

    }

    @Test
    public void testCount2() throws Exception {
        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();
        Assert.assertEquals(6, longestStabilityPeriod.count(new int[]{901, 901, 901, 902, 902, 903, 903, 902, 902, 901}));

    }
}