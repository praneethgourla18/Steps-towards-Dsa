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
   public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // Empty tree is symmetric
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();

            // If both nodes are null, continue to next pair
            if (leftNode == null && rightNode == null) {
                continue;
            }

            // If one is null or values do not match, it's not symmetric
            if (leftNode == null || rightNode == null || leftNode.val != rightNode.val){
                return false;
            }

            // Enqueue children in opposite order to compare mirrored structure
            queue.offer(leftNode.left);
            queue.offer(rightNode.right);
            queue.offer(leftNode.right);
            queue.offer(rightNode.left);
        }

        return true; // All checks passed, tree is symmetric
    }
}