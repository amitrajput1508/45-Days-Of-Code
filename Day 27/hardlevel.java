public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        
        Node current = root;

        while (current.left != null) {
            Node temp = current; // Store the current level's starting node
            while (current != null) {
                // Connect left child to right child
                current.left.next = current.right;

                // Connect right child to the next left child if available
                if (current.next != null) {
                    current.right.next = current.next.left;
                }

                // Move to the next node in the current level
                current = current.next;
            }
            // Move to the next level
            current = temp.left;
        }

        return root;
    }
}
