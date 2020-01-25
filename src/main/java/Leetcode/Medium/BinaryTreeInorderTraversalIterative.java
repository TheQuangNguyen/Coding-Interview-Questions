package Leetcode.Medium;

import java.util.*;

public class BinaryTreeInorderTraversalIterative {

    // Given a binary tree, return the inorder traversal of its nodes' values using an iterative approach

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Set<TreeNode> seen = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode current = stack.peek();
            if (current.left != null && !seen.contains(current.left)) {
                stack.push(current.left);
            } else {
                output.add(current.val);
                seen.add(current);
                stack.pop();
                if (current.right != null) {
                    stack.push(current.right);
                }
            }
        }
        return output;
    }

    // Runtime: 1 ms, faster than 31.23%
    // Memory Usage: 41.4 MB, less than 5.11%

    // Time complexity is O(n) where n is the number of nodes in the binary tree
    // Space complexity is O(n) where n is the number of nodes in the binary tree
}
