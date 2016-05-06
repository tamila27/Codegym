package com.goit.gojavaonline.codegym;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 4/29/16.
 */
public class FirstOddNumberTest {
    private FirstOddNumber firstOddNumber;

    @Test
    public void testFind() throws Exception {
        firstOddNumber = new FirstOddNumber();
        int[] input = new int[]{1,2,3};
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, firstOddNumber.find(input));
    }

    @Test
    public void testFind2() throws Exception {
        firstOddNumber = new FirstOddNumber();
        int[] input = new int[]{3, };
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, firstOddNumber.find(input));
    }
}