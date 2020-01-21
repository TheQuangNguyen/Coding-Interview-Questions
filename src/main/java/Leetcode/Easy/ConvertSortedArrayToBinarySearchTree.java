package Leetcode.Easy;

public class ConvertSortedArrayToBinarySearchTree {

    // Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
    //
    // For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
    //
    // Example:
    //
    // Given the sorted array: [-10,-3,0,5,9],
    //
    // One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
    //
    //      0
    //     / \
    //   -3   9
    //   /   /
    // -10  5

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode currentNode = new TreeNode(nums[mid]);
        currentNode.left = sortedArrayToBST(nums, start, mid -1);
        currentNode.right = sortedArrayToBST(nums, mid + 1, end);

        return currentNode;
    }

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 44.3 MB, less than 5.16%

    // Time complexity is O(n) for length of nums array
    // Space complexity is O(log(n)) for stack space
}
