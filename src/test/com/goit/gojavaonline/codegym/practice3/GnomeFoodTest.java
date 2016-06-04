package com.goit.gojavaonline.codegym.practice3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/20/16.
 */
public class GnomeFoodTest {

    @Test
    public void testFind() throws Exception {
        GnomeFood gnomeFood = new GnomeFood();
        Assert.assertArrayEquals(new int[]{4, 2, 1, 0, 3}, gnomeFood.find(new int[]{5, 7, 6, 9, 4}, new int[]{8, 5, 6, 2, 3}));
    }
}