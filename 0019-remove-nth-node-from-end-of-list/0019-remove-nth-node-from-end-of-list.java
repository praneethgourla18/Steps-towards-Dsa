/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        if(n==size){
          head=head.next;
          return head;
        }

        int i= size-n;
        ListNode hey=head;
        for(int j=1;j<i;j++){
          hey=hey.next;
        }
       
        hey.next=hey.next.next;
        
       
        

        return head;
    }
}