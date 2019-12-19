package Easy;

public class SymmetricTree {

    // Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
    //
    //For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    //      1
    //     / \
    //    2   2
    //   / \ / \
    //  3  4 4  3
    // /         \
    //5           5

    // But the following [1,2,2,null,3,null,3] is not:

    //    1
    //   / \
    //  2   2
    //   \   \
    //   3    3

    public boolean isSymmetric(TreeNode root) {
        // check for case that tree is empty or just a single node
        if (root == null || (root.left == null && root.right == null) ) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if ((node1 == null && node2 != null) || (node1 != null && node2 == null) || node1.val != node2.val) {
            return false;
        } else {
            return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Time complexity is O(n) where n the total number of nodes within the tree
    // Space complexity is O(1) for heap but O(h) where h is the depth of the tree

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 37.9 MB, less than 72.11%
}
