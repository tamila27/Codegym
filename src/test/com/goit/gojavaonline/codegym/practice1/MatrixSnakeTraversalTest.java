package com.goit.gojavaonline.codegym.practice1;

import com.goit.gojavaonline.codegym.practice1.MatrixSnakeTraversal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 4/29/16.
 */
public class MatrixSnakeTraversalTest {

    @Test
    public void testPrint() throws Exception {
        int[][] input = new int[][]{{ 1, 2, 3 },
                { 4, 5, 6 },
                {7, 8, 9 }};
        int[] expectedResult = new int[]{1, 4, 7, 8, 5, 2, 3, 6, 9};

        MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();
        Assert.assertArrayEquals(expectedResult, matrixSnakeTraversal.print(input));

    }

    @Test
    public void testPrint2() throws Exception {
        int[][] input = new int[][]{{ 1, 2, 3, },{ 4, 5, 6, },{ 7, 8, 9, },{ 10, 11, 12, }};
        int[] expectedResult = new int[]{ 1, 4, 7, 10, 11, 8, 5, 2, 3, 6, 9, 12, };

        MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();
        Assert.assertArrayEquals(expectedResult, matrixSnakeTraversal.print(input));

    }
}