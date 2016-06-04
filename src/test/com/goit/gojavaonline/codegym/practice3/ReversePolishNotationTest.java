package com.goit.gojavaonline.codegym.practice3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/20/16.
 */
public class ReversePolishNotationTest {

    @Test
    public void testEvaluate() throws Exception {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        Assert.assertEquals(2, reversePolishNotation.evaluate("1 1+"));
    }

    @Test
    public void testEvaluate2() throws Exception {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        Assert.assertEquals(49, reversePolishNotation.evaluate("2 5 + 3 4 + *"));
    }
}