class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    // Method to deserialize a string representation of a list into a ListNode linked list
    public static ListNode deserialize(String data) {
        String[] values = data.replaceAll("[\\[\\] ]", "").split(",");
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value));
            current = current.next;
        }

        return dummyHead.next; // Return the head of the linked list
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
