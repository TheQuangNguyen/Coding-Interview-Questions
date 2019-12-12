public class PlusOne {

    // Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
    // The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
    // You may assume the integer does not contain any leading zero, except the number 0 itself.

    // Input: [1,2,3]
    // Output: [1,2,4]
    // Explanation: The array represents the integer 123.

    public int[] plusOne(int[] digits) {

        int currentDigitIndex = digits.length - 1;

        while (currentDigitIndex > 0 && digits[currentDigitIndex] == 9) {
            digits[currentDigitIndex] = 0;
            currentDigitIndex--;
        }

        if (currentDigitIndex == 0 && digits[currentDigitIndex] == 9) {
            int[] result = new int[digits.length + 1];
            result[currentDigitIndex++] = 1;
            result[currentDigitIndex++] = 0;
            while (currentDigitIndex < result.length) {
                result[currentDigitIndex] = digits[currentDigitIndex - 1];
                currentDigitIndex++;
            }
            return result;
        } else {
            digits[currentDigitIndex] = digits[currentDigitIndex] + 1;
            return digits;
        }
    }

    // Time complexity is O(n) where n is the number of digits the number represented by the array is
    // Space complexity is O(n) where if the most significant digit is 9 and it get increase by 1, there need to be a new array to hold the number

    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 35 MB, less than 98.39%
}
