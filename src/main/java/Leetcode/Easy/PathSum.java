package Leetcode.Easy;

public class PathSum {

    // Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
    // Given the below binary tree and sum = 22,
    //
    //      5
    //     / \
    //    4   8
    //   /   / \
    //  11  13  4
    // /  \      \
    //7    2      1
    //return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
    //
    //Accepted

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum = sum - root.val;
        if (root.left == null && root.right == null) {
            return sum == 0;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {val = x;}
    }

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 36.2 MB, less than 100.00%

    // Time Complexity is O(n) since there is a chance that we have to visit every nodes to find the path sum
    // Space Complexity is O(1) for heap and O(h) for stack where h is the height of the tree
}
