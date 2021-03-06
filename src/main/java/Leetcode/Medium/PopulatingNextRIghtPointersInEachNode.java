package Leetcode.Medium;

public class PopulatingNextRIghtPointersInEachNode {

    // You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
    //
    //struct Node {
    //  int val;
    //  Node *left;
    //  Node *right;
    //  Node *next;
    //}
    //Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
    //
    //Initially, all next pointers are set to NULL.
    //
    //
    //
    //Follow up:
    //
    //You may only use constant extra space.
    //Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        Node level_start = root;
        while (level_start != null) {
            Node current = level_start;
            while (current != null){
                if (current.left != null) {
                    current.left.next = current.right;
                }
                if (current.right != null && current.next != null) {
                    current.right.next=current.next.left;
                }

                current = current.next;
            }
            level_start = level_start.left;
        }

        return root;
    }
}
