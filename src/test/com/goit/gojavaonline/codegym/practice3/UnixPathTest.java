package com.goit.gojavaonline.codegym.practice3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/19/16.
 */
public class UnixPathTest {

    @Test
    public void testSimplify() throws Exception {
        UnixPath unixPath = new UnixPath();
        Assert.assertEquals("/var/lib/file.txt", unixPath.simplify("/home/../var/./lib//file.txt"));

    }
}