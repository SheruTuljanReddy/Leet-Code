class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            // Extract the last digit
            int digit = x % 10;

            // Check for overflow/underflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Append the digit to the result
            result = result * 10 + digit;

            // Remove the last digit from x
            x /= 10;
        }

        return result;
    }
}
