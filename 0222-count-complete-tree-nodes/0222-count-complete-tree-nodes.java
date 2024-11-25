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
    public int countNodes(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int count=0;

        queue.offer(root);
        while(!queue.isEmpty()){
            queue.poll();
            count++;

            if(root.left!=null){
                queue.offer(root.left);
            }
            if(root.right!=null){
                queue.offer(root.right);
            }
        }
        return count;
    }
}