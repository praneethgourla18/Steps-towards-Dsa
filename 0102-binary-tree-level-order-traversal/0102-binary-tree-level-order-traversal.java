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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList<>();
        
        if(root==null){
            return list;
        }

        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> res=new ArrayList<>();
            int level=queue.size();
            for(int i=0;i<level;i++){
                TreeNode current=queue.poll();
                res.add(current.val);
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
         list.add(res);
        }
      return list;
    }
}

// public int levelOrderSuccessor(TreeNode root,TreeNode target) {
        
      
//         if(root==null){
//             return -1;
//         }

//         Queue<TreeNode> queue=new LinkedList<>();

//         queue.offer(root);

//         while(!queue.isEmpty()){
            
//                 TreeNode current=queue.poll();
        
//                 if(current.left!=null){
//                     queue.offer(current.left);
//                 }
//                 if(current.right!=null){
//                     queue.offer(current.right);
//                 }

//                 if(target==current){
//                     return queue.peek() != null ? queue.peek().val : -1;
//                 }
         
//         }
//       return -1;
//     }