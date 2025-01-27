class Solution {
    public int maxArea(int[] height) {
        int left = 0; // Start pointer at the beginning of the array
        int right = height.length - 1; // End pointer at the end of the array
        int maxArea = 0; // Variable to store the maximum area

        while (left < right) {
            // Calculate the current area
            int width = right - left; // Distance between pointers
            int currentHeight = Math.min(height[left], height[right]); // Shorter line determines the height
            int area = width * currentHeight;

            // Update maxArea if current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea; // Return the maximum area found
    }
}
