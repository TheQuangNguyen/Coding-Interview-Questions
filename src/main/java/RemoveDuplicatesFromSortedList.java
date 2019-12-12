public class RemoveDuplicatesFromSortedList {

    // Given a sorted linked list, delete all duplicates such that each element appear only once

    // Input: 1->1->2->3->3
    // Output: 1->2->3

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.next != null && currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    // Time complexity is O(n) since you have to check all elements of the linked list
    // Space complexity is O(1) since you are only keeping track of the current node

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 36.3 MB, less than 100.00%
}
