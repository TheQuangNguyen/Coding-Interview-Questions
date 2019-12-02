public class SearchInsertPosition {
    // Given a sorted array and a target value, return the index if the target is found. If not,
    // return the index where it would be if it were inserted in order.
    // Examples:
    // Input: [1,3,5,6], 5      Output: 2
    // Input: [1,3,5,6], 2      Output: 1
    // Input: [1,3,5,6], 7      Output: 4
    // Input: [1,3,5,6], 0      Output: 0

    public int searchInsert(int[] nums, int target) {
        // Loop through every element in the array. If the number in nums array equals the target, then return the index.
        // Otherwise check if the number is greater than the target or not. If it is, then we passed where the target number should be
        // so return the index of the current number.
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }

    // Time complexity is O(n) since there is a chance that the target is not within the array and it is larger than every elements in the array
    // Space complexity is O(1) since we are not storing anything
}
