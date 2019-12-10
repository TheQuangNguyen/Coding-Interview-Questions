public class SquareRoot {

    // Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
    // Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
    // Input: 4
    // Output: 2
    // Input: 8
    // Output: 2
    // Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

    public int mySqrt(int x) {
        return mySqrt(x,1,x);
    }

    public int mySqrt(int x, int min, int max) {
        int guess = (max + min) / 2;
        if (guess * guess <= x && (guess + 1) * (guess + 1) > x) {
            return guess;
        } else if (guess * guess < x) {
            return mySqrt(x, guess + 1, max);
        } else {
            return mySqrt(x, min, guess - 1);
        }
    }
}
