package Leetcode.Easy.Medium;

public class CopyListWithRandomPointers {

    // A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
    //
    // Return a deep copy of the list.
    //
    // The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
    //
    // val: an integer representing Node.val
    // random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node originalCurrent = head;

        // interweave original linked list with the copied list
        while (originalCurrent != null) {
            Node copyCurrent = new Node(originalCurrent.val);
            Node originalNext = originalCurrent.next;
            originalCurrent.next = copyCurrent;
            copyCurrent.next = originalNext;
            originalCurrent = originalCurrent.next.next;
        }

        originalCurrent = head;

        // Going through the interweaved linked list again have the copied list getting the correct nodes for random pointers
        while (originalCurrent != null) {
            Node originalRandom = originalCurrent.random;
            Node copyCurrent = originalCurrent.next;
            if (originalRandom != null) {
                copyCurrent.random = originalRandom.next;
            } else {
                copyCurrent.random = originalRandom;
            }
            originalCurrent = originalCurrent.next.next;
        }

        originalCurrent = head;
        Node answer = head.next;

        // Go through the list one last time to restore the original list while extract the copied list
        while (originalCurrent != null) {
            Node copyCurrent = originalCurrent.next;
            originalCurrent.next = originalCurrent.next.next;
            if (copyCurrent.next != null) {
                copyCurrent.next = copyCurrent.next.next;
            } else {
                copyCurrent.next = copyCurrent.next;
            }
            originalCurrent = originalCurrent.next;
        }

        return answer;
    }

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 44.4 MB, less than 5.61%

    // Time Complexity is O(n) since we have to travel through the original linked list three times
    // Space Complexity is O(1) since we are only storing the location of the currentNode and the copy of that currentNode
}
