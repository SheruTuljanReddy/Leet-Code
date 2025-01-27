class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through the nums array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that would sum up to the target
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // If no solution is found (though it's guaranteed that one exists), return an empty array
        return new int[0];
    }
}
