package CrackingTheCodingInterview.LinkedLists;

public class LoopDetection {

    // Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
    // Input : A -> B -> C -> D -> E -> F -> H -> C
    // Output: C

    class Node {
        String val;
        Node next;
        public Node(String val) {
            this.val = val;
        }
    }

    public Node LoopDetection(Node head) {
        Node slower = head;
        Node faster = head;

        while (slower != null && faster != null) {
            slower = slower.next;
            faster = faster.next.next;

            if (slower == faster) {
                break;
            }
        }

        if (faster == null || slower == null) {
            return null;
        }

        slower = head;
        while (slower != faster) {
            slower = slower.next;
            faster = faster.next;
        }

        return faster;
    }
}
