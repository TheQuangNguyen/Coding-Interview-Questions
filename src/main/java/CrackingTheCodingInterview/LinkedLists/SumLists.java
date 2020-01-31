package CrackingTheCodingInterview.LinkedLists;

public class SumLists {

    // You have two numbers represented by a linked list, where each node contains a single digit.
    // The digits are stored in reverse order, such that the 1's digit is at the head of the list.
    // Write a function that adds the two numbers and returns the sum as a linked list.
    // Example
    // Input: (7 -> 1 -> 6) + (5 -> 9 -> 2) That is, 617 + 295
    // Output: 2 -> 1 -> 9 That is, 912

    class Node {
        int val;
        Node next;
        public Node(int x) { this.val = x;}
    }

    public Node addLists(Node l1, Node l2) {
        return addLists(l1, l2, 0);
    }

    public Node addLists(Node l1, Node l2, int carry) {
        if (l1 == null & l2 == null & carry == 0) {
            return null;
        }
        int sum = carry;

        if (l1 != null) {
            sum += l1.val;
        }

        if (l2 != null) {
            sum += l2.val;
        }

        Node current = new Node(sum % 10);

        if (l1.next != null || l2.next != null) {
            current.next = addLists(l1.next, l2.next, sum >= 10 ? 1 : 0);
        }

        return current;
    }
}
