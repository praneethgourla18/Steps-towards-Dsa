class Solution {
    public Node addOne(Node head) {
        if (head == null) {
            return new Node(1);
        }

        // Reverse the linked list to make addition easier
        head = reverse(head);

        Node temp = head;
        int carry = 1;

        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }

            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry);
                carry = 0;
            }

            temp = temp.next;
        }

        // Reverse the linked list back to its original order
        return reverse(head);
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
