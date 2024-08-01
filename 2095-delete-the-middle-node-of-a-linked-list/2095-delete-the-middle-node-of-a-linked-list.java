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
    public ListNode deleteMiddle(ListNode head) {

        //Method 1

        // if(head==null ||head.next==null){
        //     return null;
        // }
        // int size=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // int mid=size/2;
        // ListNode t=head;
        // for(int i=0;i<mid-1;i++){
        //     t=t.next;
        // }
        // t.next=t.next.next;
        // return head;

        //Method 2

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }

        
            prev.next=slow.next;
        
        return head;
    }
}