package Easy;

public class MinDepthBinaryTree {

    // Given a binary tree, find its minimum depth.
    //
    // The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

    // Given binary tree [3,9,20,null,null,15,7],
    //
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7
    // return its minimum depth = 2.

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Time complexity is O(n) since we have to visit every nodes
    // Space complexity is O(1) for heap and O(h) for stack where h is the max depth of the tree

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 39.3 MB, less than 98.44%
}
