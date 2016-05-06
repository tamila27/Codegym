package com.goit.gojavaonline.codegym.practice1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 4/26/16.
 */
public class SumDigitsTest {

    @Test
    public void testSum() throws Exception {
        int number = -2147483648;
        int expectedResult = 47;

        SumDigits sumDigits = new SumDigits();
        Assert.assertEquals(expectedResult, sumDigits.sum(number));

    }
}