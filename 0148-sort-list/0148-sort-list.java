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
    public ListNode sortList(ListNode head) {
        ListNode old=head;
        int size=0;
        while(old!=null){
            size++;
            old=old.next;
        }
        for(int i=0;i<size;i++){
            ListNode temp=head;
            while(temp.next!=null){
                if(temp.val>temp.next.val){
                    int s=temp.val;
                    temp.val=temp.next.val;
                    temp.next.val=s;
                }
                temp=temp.next;
            }
        }
        return head;
    }
}