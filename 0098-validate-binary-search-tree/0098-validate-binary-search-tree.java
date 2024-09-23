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
        if(root==null){
            return true;
        }
        boolean lefans=true;
        boolean rigans=true;
        if(root.left!=null){
           if(root.left.val>=root.val){
               lefans=false;
           }
        }
        if(root.right!=null){
            if(root.right.val<=root.val){
                rigans=false;
            }
        }
        
        return(lefans && rigans && isValidBST(root.left) && isValidBST(root.right));
    }
}