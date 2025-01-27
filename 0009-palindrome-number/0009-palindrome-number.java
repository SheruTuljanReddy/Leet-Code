class Solution {
    public boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome
        // A number that ends with 0 (except 0 itself) cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // Reverse only the second half of the number
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10; // Get the last digit
            x /= 10; // Remove the last digit from x
        }

        // Check if the original half equals the reversed half
        // For an odd number of digits, we can ignore the middle digit using reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
