class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr1[] =  new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for(int num : nums){
            if(num%2==0){
                arr1[evenIndex] = num;
                evenIndex++;
            }else{
                arr1[oddIndex] = num;
                oddIndex--;
            }
        }
        return arr1;
    }
}