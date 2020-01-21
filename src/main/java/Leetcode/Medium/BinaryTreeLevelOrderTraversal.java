package Leetcode.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    // Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
    //
    // For example:
    // Given binary tree [3,9,20,null,null,15,7],
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7
    // return its level order traversal as:
    // [
    //  [3],
    //  [9,20],
    //  [15,7]
    // ]

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }

        Queue queue = new Queue(root);
        List<TreeNode> levelNodeList = new LinkedList<>();

        while (!queue.isEmpty()) {
            while (!queue.isEmpty()) {
                levelNodeList.add(queue.dequeue());
            }
            List<Integer> currentLevelNodeValues = new ArrayList<>();
            while(!levelNodeList.isEmpty()) {
                TreeNode currentNode = levelNodeList.remove(0);
                currentLevelNodeValues.add(currentNode.val);
                queue.enqueue(currentNode.left);
                queue.enqueue(currentNode.right);
            }
            answer.add(currentLevelNodeValues);
        }

        return answer;
    }

    public class Node {
        TreeNode treeNode;
        Node next;
        Node(TreeNode x) { treeNode = x; }
    }

    public class Queue {
        Node back = null;
        Node front = null;

        public Queue(TreeNode val) {
            this.back = new Node(val);
            this.front = this.back;
        }

        // adding new node to the back of the queue
        public void enqueue(TreeNode treeNode) {
            if (treeNode != null) {
                Node oldBack = this.back;
                this.back = new Node(treeNode);
                if (!isEmpty()) {
                    oldBack.next = this.back;
                } else {
                    this.front = this.back;
                }
            }
        }

        // remove a node from the front of the queue
        public TreeNode dequeue() {
            TreeNode result = this.front.treeNode;
            this.front = this.front.next;

            if (isEmpty()) {
                this.back = null;
            }
            return result;
        }

        // checks if the queue is empty
        public boolean isEmpty() {
            return this.front == null;
        }
    }

    // Runtime: 2 ms, faster than 5.54%
    // Memory Usage: 42.4 MB, less than 5.33%
}
