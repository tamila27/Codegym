package com.goit.gojavaonline.codegym.practice1;

import com.goit.gojavaonline.codegym.practice1.JoinCharacters;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 4/26/16.
 */
public class JoinCharactersTest {

    @Test
    public void testJoin() throws Exception {
        char[] initialArray = {'1', '2', '3'};
        int expectedResult = 123;

        JoinCharacters joinCharacters = new JoinCharacters();
        Assert.assertEquals(expectedResult, joinCharacters.join(initialArray));
    }
    @Test
    public void testJoin2() throws Exception {
        char[] initialArray = {'1', '2'};
        int expectedResult = 12;

        JoinCharacters joinCharacters = new JoinCharacters();
        Assert.assertEquals(expectedResult, joinCharacters.join(initialArray));
    }
}