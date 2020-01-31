import CrackingTheCodingInterview.LinkedLists.Partition;

import static CrackingTheCodingInterview.LinkedLists.SumLists.*;

public class Test {

    static class Node {
        int val;
        Node next;

        public Node(int value) { val = value;};
    }

    public static void main(String[] args) {
        Node l1Head = new Node(7);
        Node current = l1Head;
        current.next = new Node(1);
        current = current.next;
        current.next = new Node(6);

        Node l2Head = new Node(5);
        current = l2Head;
        current.next = new Node(9);
        current = current.next;
        current.next = new Node(2);

        Node result = add
    }
}
