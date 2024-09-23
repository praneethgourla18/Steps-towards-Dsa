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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // List<List<Integer>> list = new ArrayList<>();
        
        // if (root == null) {
        //     return list;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);
        
        // int levelNo = 0; // Level counter

        // while (!queue.isEmpty()) {
        //     List<Integer> res = new ArrayList<>();
        //     int levelSize = queue.size();

        //     for (int i = 0; i < levelSize; i++) {
        //         TreeNode current = queue.poll();
                
        //         // Add current node's value to the result list
        //         if (levelNo % 2 == 0) { // Even level: left to right
        //             res.add(current.val);
        //         } else { // Odd level: right to left
        //             res.add(0, current.val); // Add to the front for reverse order
        //         }

        //         // Enqueue children nodes
        //         if (current.left != null) {
        //             queue.offer(current.left);
        //         }
        //         if (current.right != null) {
        //             queue.offer(current.right);
        //         }
        //     }

        //     list.add(res); // Add the level's results to the list
        //     levelNo++; // Increment the level counter
        // }
        
        // return list;


        //using a deque (doubled ended queue)

         List<List<Integer>> list = new ArrayList<>();
        
        if (root == null) {
            return list;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        
        int levelNo = 0; // Level counter

        while (!deque.isEmpty()) {
            List<Integer> res = new ArrayList<>();
            int levelSize = deque.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current;
                
                // Add nodes from the deque based on the level number
                if (levelNo % 2 == 0) { // Even level: left to right
                    current = deque.pollFirst();
                    res.add(current.val);
                    if (current.left != null) {
                        deque.offerLast(current.left);
                    }
                    if (current.right != null) {
                        deque.offerLast(current.right);
                    }
                } else { // Odd level: right to left
                    current = deque.pollLast();
                    res.add(current.val);
                    if (current.right != null) {
                        deque.offerFirst(current.right);
                    }
                    if (current.left != null) {
                        deque.offerFirst(current.left);
                    }
                }
            }

            list.add(res); // Add the level's results to the list
            levelNo++; // Increment the level counter
        }
        
        return list;
    }
}