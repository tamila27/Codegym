package com.goit.gojavaonline.codegym.practice4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/20/16.
 */
public class WordNumberTest {

    @Test
    public void testCount() throws Exception {
        WordNumber wordNumber = new WordNumber();

        Assert.assertEquals(2, wordNumber.count("hI mAN"));
    }

    @Test
    public void testCount2() throws Exception {
        WordNumber wordNumber = new WordNumber();

        Assert.assertEquals(3, wordNumber.count("red/green/blue"));
    }
}