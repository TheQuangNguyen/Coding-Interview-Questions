import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    // Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
    // find all unique combinations in candidates where the candidate numbers sum to target
    // The same repeated number may be chosen from candidates unlimited number of times
    // All numbers must be positive integers
    // The solution set must not contain duplicate combinations

    // Input: candidates = [2,3,6,7], target = 7,
    //  A solution set is:
    //  [
    //  [7],
    //  [2,2,3]
    //  ]

    // Input: candidates = [2,3,5], target = 8,
    //  A solution set is:
    //  [
    //  [2,2,2,2],
    //  [2,3,3],
    //  [3,5]
    //  ]

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solution = new ArrayList<>();
        backtrack(candidates, solution, new ArrayList<>(), target, 0);
        return solution;
    }

    // helper method to recursively check through all numbers for solution
    public void backtrack(int[] candidates, List<List<Integer>> solution, List<Integer> tempList, int target, int start) {
        if (target == 0) {
            solution.add(new ArrayList<>(tempList));
        } else if (target < 0) {
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(candidates, solution, tempList, target - candidates[i], i);
                tempList.remove(tempList.size() -1);
            }
        }
    }

    // Runtime: 5 ms, faster than 52.48% of Java online submissions
    // Memory Usage: 37.4 MB, less than 100.00% of Java online submissions


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Same as the one above except each number in candidates may only be used once in the combination and duplicates in candidates are allowed

    // Input: candidates = [10,1,2,7,6,1,5], target = 8,
    //  A solution set is:
    //  [
    //  [1, 7],
    //  [1, 2, 5],
    //  [2, 6],
    //  [1, 1, 6]
    //  ]

    // Input: candidates = [2,5,2,1,2], target = 5,
    //  A solution set is:
    //  [
    //  [1,2,2],
    //  [5]
    //  ]

//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//
//    }
}
