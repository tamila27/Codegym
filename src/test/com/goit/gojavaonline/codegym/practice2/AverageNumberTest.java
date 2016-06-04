package com.goit.gojavaonline.codegym.practice2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/13/16.
 */
public class AverageNumberTest {

    @Test
    public void testAverage() throws Exception {
        AverageNumber averageNumber = new AverageNumber();
        Assert.assertEquals(-1073741825, averageNumber.average(-2147483648, -2));
    }

    @Test
    public void testAverage2() throws Exception {
        AverageNumber averageNumber = new AverageNumber();
        Assert.assertEquals(-3, averageNumber.average(-3, -3));
    }
}