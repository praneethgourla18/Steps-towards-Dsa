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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val); // If root is null, create and return a new node.
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val); // Insert into right subtree if val is greater.
        } else {
            root.left = insertIntoBST(root.left, val); // Insert into left subtree if val is smaller.
        }
        
        return root;
        
       
    }
}