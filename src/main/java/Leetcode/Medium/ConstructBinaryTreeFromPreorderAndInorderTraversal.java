package Leetcode.Medium;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    // Given preorder and inorder traversal of a tree, construct the binary tree.
    //
    // Note:
    // You may assume that duplicates do not exist in the tree.
    //
    // For example, given
    //
    // preorder = [3,9,20,15,7]
    // inorder = [9,3,15,20,7]
    // Return the following binary tree:
    //
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        int inorderIndex = findIndexOfValue(inorder, 0, inorder.length, preorder[0]);
        TreeNode root = new TreeNode(preorder[0]);
        root.left = buildTree(preorder, inorder, 0, inorderIndex - 1, 1);
        root.right = buildTree(preorder, inorder, inorderIndex + 1, preorder.length - 1, inorderIndex + 1);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int start, int end, int preorderIndex) {
        if (start > end) {
            return null;
        }

        int inorderIndex = findIndexOfValue(inorder, start, end, preorder[preorderIndex]);
        TreeNode currentNode = new TreeNode(preorder[preorderIndex]);
        currentNode.left = buildTree(preorder, inorder, start, inorderIndex - 1, preorderIndex + 1);
        currentNode.right = buildTree(preorder, inorder, inorderIndex + 1, end, preorderIndex + (inorderIndex - start + 1));

        return currentNode;
    }

    public int findIndexOfValue(int[] inorder, int start, int end, int target) {

        int currentValue = inorder[start];
        while (target != currentValue && start < end) {
            start++;
            currentValue = inorder[start];
        }

        return start;
    }

    // Runtime: 14 ms, faster than 12.37%
    // Memory Usage: 47.6 MB, less than 5.61%

    // Time Complexity is O(n) for number of nodes in the binary tree
    // Space complexity is
}
