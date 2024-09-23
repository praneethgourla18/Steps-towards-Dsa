/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         
      
        
    //     if(root==null){
    //         return root;
    //     }

    //     Queue<Node> queue=new LinkedList<>();

    //     queue.offer(root);

    //     while(!queue.isEmpty()){
    //         int level=queue.size();
    //         Node prev=null;
    //         for(int i=0;i<level;i++){
    //             Node current=queue.poll();
                
    //             if(prev!=null){
    //                 prev.next=current;
    //             }
    //             prev=current;

    //             if(current.left!=null){
    //                 queue.offer(current.left);
    //             }
    //             if(current.right!=null){
    //                 queue.offer(current.right);
    //             }
    //         }
    //      prev.next=null;
    //     }
    //   return root;


        // constant space

        if (root == null) {
            return root;
        }

        Node leftmost = root;

        while (leftmost.left != null) { // Go through each level
            Node current = leftmost;

            while (current != null) {
                // Connect the left child to the right child
                current.left.next = current.right;

                // Connect the right child to the next left child (if it exists)
                if (current.next != null) {
                    current.right.next = current.next.left;
                }

                // Move to the next node in the current level
                current = current.next;
            }

            // Explicitly connect the rightmost node's next to null (optional, for clarity)
            
            // Move to the next level
            leftmost = leftmost.left;
        }

        return root;
    }
}