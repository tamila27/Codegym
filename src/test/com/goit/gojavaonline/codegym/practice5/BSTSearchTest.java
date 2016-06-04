package com.goit.gojavaonline.codegym.practice5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tamila on 5/24/16.
 */
public class BSTSearchTest {

    @Test
    public void testExist() throws Exception {

        //[ 10 ][ 5 15 ][ 2 7 # 20 ][ 1 3 6 9 19 # ][ # # # 4 # # 8 # 16 # ][ # # # # # 18 ][ 17 # ][ # # ], target: 8
        BSTSearch bstSearch = new BSTSearch();
        //TreeNode treeNode = new TreeNode(10, new TreeNode(5, new TreeNode(2), new TreeNode(7)), new TreeNode(15, null, new TreeNode(20)), new TreeNode(15, ));
        TreeNode treeNode = new TreeNode(10, new TreeNode(5, new TreeNode(2, null, null), new TreeNode(7, null, null)), new TreeNode(15, null, new TreeNode(20, null, null)));

        Assert.assertEquals(true, bstSearch.exist(treeNode, 7));

    }
}