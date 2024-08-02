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

          
        if (headA == null || headB == null) return null;
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int size1 = 0;
        int size2 = 0;

      
        while (temp1 != null) {
            size1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            size2++;
            temp2 = temp2.next;
        }

      
        temp1 = headA;
        temp2 = headB;

      
        if (size1 > size2) {
            int n = size1 - size2;
            for (int i = 0; i < n; i++) {
                temp1 = temp1.next;
            }
        } else {
            int n = size2 - size1;
            for (int i = 0; i < n; i++) {
                temp2 = temp2.next;
            }
        }

      
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;  
    }
}