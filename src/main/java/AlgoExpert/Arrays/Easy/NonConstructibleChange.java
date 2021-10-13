package AlgoExpert.Arrays.Easy;

import java.util.Arrays;

public class NonConstructibleChange {

    // Time = O(nlog(n))
    // Space = O(1)
    // My Solution
    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);

        int currentSum = 0;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > currentSum + 1) {
                return currentSum + 1;
            } else {
                currentSum += coins[i];
            }
        }

        return currentSum + 1;
    }
}
