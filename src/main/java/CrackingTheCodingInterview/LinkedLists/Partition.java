package CrackingTheCodingInterview.LinkedLists;

public class Partition {

    // Write code to partition a linked list around a value x, such that al nodes less than x come before all nodes greater than or equal to x.
    // Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
    // Output: 3 -> 1 -> 2      ->      10 -> 5 -> 5 -> 8

    class Node {
        int val;
        Node next;

        public Node(int value) { val = value;};
    }

    public static Node partition(Node head, int x) {
        Node left = null;
        Node right = null;
        Node rightStart = null;

        Node current = head;

        while (current != null) {
            if (current.val < x) {
                if (left == null) {
                    left = current;
                } else {
                    left.next = current;
                    left = current;
                }
            } else {
                if (right == null) {
                    right = current;
                    rightStart = current;
                } else {
                    right.next = current;
                    right = current;
                }
            }
            current = current.next;
        }

        left.next = rightStart;
        right.next = null;
        return head;
    }
}
