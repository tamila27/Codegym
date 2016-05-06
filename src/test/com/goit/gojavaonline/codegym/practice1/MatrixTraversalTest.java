package com.goit.gojavaonline.codegym.practice1;

import com.goit.gojavaonline.codegym.practice1.MatrixTraversal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 4/29/16.
 */
public class MatrixTraversalTest {

    @Test
    public void testPrint() throws Exception {
        int[][] input = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] expected = new int[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        int[] result = matrixTraversal.print(input);
        System.out.print("[ ");
        for (int number : result) {
            System.out.print(number + ", ");
        }
        System.out.println(" ]");
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void testPrint3() throws Exception {
        int[][] input = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[] expected = new int[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7,};
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        int[] result = matrixTraversal.print(input);
        System.out.print("[ ");
        for (int number : result) {
            System.out.print(number + ", ");
        }
        System.out.println(" ]");
        Assert.assertArrayEquals(expected, result);

    }
}