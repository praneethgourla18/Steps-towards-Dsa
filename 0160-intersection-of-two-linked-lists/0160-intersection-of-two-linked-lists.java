/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //Bruteforce -> O(m+n) time and O(m) space
        // ListNode temp=headA;
        // HashMap<ListNode,Integer> map=new HashMap<>();
        // while(temp!=null){
        //     map.put(temp,1);
        //     temp=temp.next;
        // }
        // temp=headB;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return temp;
        //     }
        //     temp=temp.next;
        // }
        // return null;
    }
}