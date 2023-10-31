class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

        int[] result = new int[n];
        System.arraycopy(nums, n - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, n - k);
        System.arraycopy(result, 0, nums, 0, n);
        
    }
}