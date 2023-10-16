class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Initialize a pointer to keep track of the last non-zero element's position.

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the nonZeroIndex position.
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}