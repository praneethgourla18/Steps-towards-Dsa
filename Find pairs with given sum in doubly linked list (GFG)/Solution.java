class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            temp=temp.next;
        }
        Node left=head;
        Node right=temp;
        while(left!=null && right!=null && left!=right && left.prev!=right)
        {
            int currentsum=left.data+right.data;
            if(currentsum==target)
            {
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                result.add(pair);
                left=left.next;
                right=right.prev;
            }
            else if(currentsum<target)
            {
                left=left.next;
            }
            else
            {
                right=right.prev;
            }
            
        }
        return result;
    }
}
