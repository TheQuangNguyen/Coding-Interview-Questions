import java.util.HashMap;

public class TwoSum {
    // Given an array of integers, return indices of the two numbers such that they add up to a specific target
    // You may assume that each input would have exactly one solution, and you may not use the same element twice
    // Example: nums = [2,7,11,15], target = 9
    // Because nums[0] + nums[1] = 2+ 7 = 9, return [0,1]

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookupNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            lookupNums.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int numberToLookFor = target - nums[i];
            if (lookupNums.containsKey(numberToLookFor)) {
                if (lookupNums.get(numberToLookFor) == i) {
                    continue;
                }
                return new int[]{i, lookupNums.get(numberToLookFor)};
            }
        }
        return new int[]{};
    }

    // This solution takes all the elements in the array and put it in hash table. Then we go through the array once again and for each
    // number, we check if the complement number needed to reach the target number is within the hash table or not. If yes then return
    // both indices. If not, then continue to the next number. This solution takes O(n) time and O(n) space.

    // My runtime beats 98.91 % of java submissions
    // My memory usage beats 98.95% of java submissions
}
