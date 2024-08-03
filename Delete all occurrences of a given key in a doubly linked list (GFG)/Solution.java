class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        
         if (head == null) return null;
         
        Node temp=head;
        while(temp!=null){
            if(temp.data==x && temp==head){
                temp.next.prev=null;
                // temp=temp.next;
                head=temp.next;
            }
            else if(temp.data==x && temp.next==null){
                temp.prev.next=null;
                return head;
            }
            else if(temp.data==x){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                
            }
            temp=temp.next;
        }
        return head;
    }
}
