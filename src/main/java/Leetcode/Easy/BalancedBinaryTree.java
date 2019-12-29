package Leetcode.Easy;

public class BalancedBinaryTree {

    // Given a binary tree, determine if it is height-balanced.
    //
    // For this problem, a height-balanced binary tree is defined as:
    //
    // a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

    // Given the following tree [3,9,20,null,null,15,7]:
    //
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7
    // Return true.

    // Given the following tree [1,2,2,3,null,null,3,4,null,null,4]:
    //
    //       1
    //      / \
    //     2   2
    //    /     \
    //   3       3
    //  /         \
    // 4           4
    // Return false.

    public boolean isBalanced(TreeNode root) {
        return isBalancedRecursive(root) >= 0;
    }

    public int isBalancedRecursive(TreeNode currentNode) {
        if (currentNode == null) {
            return 0;
        }

        int heightLeft = isBalancedRecursive(currentNode.left);
        int heightRight = isBalancedRecursive(currentNode.right);

        if (heightLeft < 0 || heightRight < 0) {
            return -1;
        }
        int difference = Math.abs(heightLeft - heightRight);
        if (difference == 1 || difference == 0) {
            return Math.max(heightLeft, heightRight) + 1;
        } else {
            return -1;
        }
    }

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    // Runtime: 1 ms, faster than 99.48%
    // Memory Usage: 39.5 MB, less than 73.15%

    // Time Complexity is O(n) since there is a chance that I need to check every nodes in the tree
    // Space Complexity is O(1) for heap and O(h) for stack
}
