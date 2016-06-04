package com.goit.gojavaonline.codegym.practice5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/24/16.
 */
public class KmpSubMoveTest {

    @Test
    public void testSubMoveQuantity() throws Exception {
        KmpSubMove kmpSubMove = new KmpSubMove();
        Assert.assertEquals(2, kmpSubMove.subMoveQuantity("abcd", "cdab"));
    }
}