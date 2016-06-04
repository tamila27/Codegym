package com.goit.gojavaonline.codegym.practice5;

/**
 * Created by tamila on 5/24/16.
 */
public class BSTSearch {
    public boolean exist(TreeNode root, int target) {
        boolean result = false;
        if(root != null){
            if(root.value == target){
                result = true;
            } else if(root.value > target){
                result = exist(root.left, target);
            } else {
                result = exist(root.right, target);
            }
        }
        return result;
    }

}

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
