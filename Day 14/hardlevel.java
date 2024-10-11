class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Deserialize a string to create a linked list
    public static ListNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }

        String[] values = data.substring(1, data.length() - 1).split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value.trim()));
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to create a cycle in the linked list for testing
    public static void createCycle(ListNode head, int pos) {
        if (pos == -1) return;

        ListNode tail = head;
        ListNode cycleNode = null;
        int index = 0;

        while (tail.next != null) {
            if (index == pos) {
                cycleNode = tail;
            }
            tail = tail.next;
            index++;
        }

        if (cycleNode != null) {
            tail.next = cycleNode;
        }
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = ListNode.deserialize("[3,2,0,-4]");
        ListNode.createCycle(head, 1);  // pos = 1 creates a cycle
        Solution solution = new Solution();
        System.out.println(solution.hasCycle(head));  // Output: true
    }
}
\
