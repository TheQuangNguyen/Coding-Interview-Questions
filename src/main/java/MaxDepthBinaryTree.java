public class MaxDepthBinaryTree {
    // Given a binary tree, find its maximum depth.
    //
    //The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    //
    //Note: A leaf is a node with no children.

    // Given binary tree [3,9,20,null,null,15,7],
    //
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7
    //return its depth = 3.

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Time complexity is O(n) since we have to check every nodes to find the max depth
    // Space complexity is O(1) for heap and O(h) for the max depth

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 38.5 MB, less than 95.70%
}
