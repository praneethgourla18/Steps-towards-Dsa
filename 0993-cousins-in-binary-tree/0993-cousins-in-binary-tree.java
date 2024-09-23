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

    public boolean isCousins(TreeNode root, int x, int y) {
        return (level(root,x,0)==level(root,y,0) && !isSibling(root,x,y));
    }

     public int level(TreeNode node, int data, int level) {
        if (node == null) {
            return -1; // Node not found
        }
        if (node.val == data) {
            return level; // Node found, return its level
        }

        // Recur for left and right subtree
        int leftLevel = level(node.left, data, level + 1);
        if (leftLevel != -1) {
            return leftLevel; // If node is found in left subtree
        }

        return level(node.right, data, level + 1); // Else search in right subtree
    }

    public boolean isSibling(TreeNode node,int x,int y){
        if(node==null){
            return false;
        }
       if (node.left != null && node.right != null) {
            // Check if both children are x and y
            if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)) {
                return true;
            }
        }

        // Recur for left and right subtrees
        return isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
}