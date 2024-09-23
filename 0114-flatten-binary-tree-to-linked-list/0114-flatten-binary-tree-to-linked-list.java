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
    public void flatten(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        Add(queue,root);
        Link(queue);
    }
    public void Add(Queue<TreeNode> queue,TreeNode node){
        if(node==null){
            return;
        }
        queue.offer(node);
        Add(queue,node.left);
        Add(queue,node.right);
    }
    public void Link(Queue<TreeNode> queue) {
        if (queue.isEmpty()) {
            return;
        }
        
       
        TreeNode prev = queue.poll();
        prev.left = null; 
        
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            prev.right = current; 

            current.left = null;   

            prev = current;      
        }
    }
}