package Easy;

import java.util.List;
import java.util.Stack;

public class BottomUpLevelTraversalBinaryTree {
    // Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
    //
    // Input
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7

    // Output
    // [
    //  [15,7],
    //  [9,20],
    //  [3]
    // ]

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<Integer> stack = new Stack<>();

        stack.push(root.val);
        
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
