package com.goit.gojavaonline.codegym.practice2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/13/16.
 */
public class AbcNumberTest {

    @Test
    public void testConvert() throws Exception {
        AbcNumber abcNumber = new AbcNumber();
        Assert.assertEquals(123, abcNumber.convert("bcd"));

    }
}