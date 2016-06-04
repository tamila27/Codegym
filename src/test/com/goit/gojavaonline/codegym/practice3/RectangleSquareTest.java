package com.goit.gojavaonline.codegym.practice3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/20/16.
 */
public class RectangleSquareTest {

    @Test
    public void testMeasure() throws Exception {
        RectangleSquare rectangleSquare = new RectangleSquare();
        Assert.assertEquals(300, rectangleSquare.measure(new int[]{0, 0}, new int[]{20, 10}, new int[]{10, 20}));
    }
}