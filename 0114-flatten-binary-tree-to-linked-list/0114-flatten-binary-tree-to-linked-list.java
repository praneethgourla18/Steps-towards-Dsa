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

    //     Queue<TreeNode> queue=new LinkedList<>();
    //     Add(queue,root);
    //     Link(queue);
    // }
    // public void Add(Queue<TreeNode> queue,TreeNode node){
    //     if(node==null){
    //         return;
    //     }
    //     queue.offer(node);
    //     Add(queue,node.left);
    //     Add(queue,node.right);
    // }
    // public void Link(Queue<TreeNode> queue) {
    //     if (queue.isEmpty()) {
    //         return;
    //     }
        
       
    //     TreeNode prev = queue.poll();
    //     prev.left = null; 
        
    //     while (!queue.isEmpty()) {
    //         TreeNode current = queue.poll();

    //         prev.right = current; 

    //         current.left = null;   

    //         prev = current;      
    //     }

       TreeNode current = root;
        
        while (current != null) {
            // If the current node has a left child
            if (current.left != null) {
                // Find the rightmost node of the left subtree
                TreeNode rightmost = current.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }
                
                // Connect the right subtree to the rightmost node
                rightmost.right = current.right;
                
                // Move the left subtree to the right
                current.right = current.left;
                current.left = null;
            }
            
            // Move to the next node (now the right child)
            current = current.right;
        }
    }
}