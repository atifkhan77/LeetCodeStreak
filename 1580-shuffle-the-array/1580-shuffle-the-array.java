class Solution {
    public int[] shuffle(int[] nums, int n) {
        int  arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i+=2){
            arr[i] = nums[i/2];
            arr[i+1] = nums[nums.length-n];
            n-=1;
        }return arr;
    }
}