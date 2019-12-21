package Easy;

import java.util.ArrayList;
import java.util.Arrays;
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
        int height = height(root);
        int index = 0;
        List<Integer>[] result = new ArrayList[height];
        levelOrderBottom(root, height, index, result);
        return Arrays.asList(result);
    }

    public void levelOrderBottom(TreeNode currentNode, int height, int index, List<Integer>[] result) {
        if (currentNode == null) {
            return;
        }
        index++;
        levelOrderBottom(currentNode.left, height, index, result);
        levelOrderBottom(currentNode.right, height, index, result);

        int currentLevel = height - index;

        if (result[currentLevel] == null) {
            List<Integer> currentLevelList = new ArrayList<>();
            currentLevelList.add(currentNode.val);
            result[currentLevel] = currentLevelList;
        } else {
            result[currentLevel].add(currentNode.val);
        }
    }

    public int height(TreeNode currentNode) {
        if (currentNode == null) {
            return 0;
        }

        return Math.max(height(currentNode.left), height(currentNode.right)) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 36.2 MB, less than 100.00%

    // Time complexity is O(n) where n is number of nodes in the tree
    // Space complexity is O(n) for heap since we have to store all the nodes' values and O(h) for stack where h is the height of the tree
}
