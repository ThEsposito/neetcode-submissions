/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkNode(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean checkNode(TreeNode root, long min, long max){
        if(root == null) return true;

        // The right subtree of every node contains only nodes with keys greater than the node's key.
        // The left subtree of every node contains only nodes with keys less than the node's key.
        if(root.val <= min || root.val >= max) return false;

        return checkNode(root.left, min, root.val) && checkNode(root.right, root.val, max);
    }
}
