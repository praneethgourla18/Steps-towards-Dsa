class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Compute the size of the list
        ListNode temp = head;
        int size = 1;  // Start at 1 since we are starting from head
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        
        // Make the list circular
        temp.next = head;
        
        // Compute the effective rotation
        k = k % size;  // Handle cases where k >= size
        if (k == 0) {
            temp.next = null;  // Break the cycle
            return head;
        }
        
        int stepsToNewHead = size - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        newTail.next = null;  // Break the cycle

        return newHead;
    }
}
