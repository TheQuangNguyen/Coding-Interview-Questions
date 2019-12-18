public class IsSameTree {

    // Given two binary trees, write a function to check if they are the same or not.
    // Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

    //Input:     1         1
    //          / \       / \
    //         2   3     2   3
    //
    //        [1,2,3],   [1,2,3]
    //
    // Output: true

    //Input:     1         1
    //          / \       / \
    //         2   1     1   2
    //
    //        [1,2,1],   [1,1,2]
    //
    // Output: false

    //Input:     1         1
    //          /           \
    //         2             2
    //
    //        [1,2],     [1,null,2]
    //
    // Output: false

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == q && p == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {
            this.val = x;
        }
    }

    // Time complexity of this would be O(n) since there is a chance that we have to check every nodes of both trees in the case that they are equal
    // Space complexity of this would be O(1) for heap and O(h) for stack where h is the height of the tree.

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 34.4 MB, less than 100.00%
}
