class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    
    // Count the frequency of each element in the array
    for (int num : nums) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    
    int sum = 0;
    
    // Sum up the unique elements with a frequency of 1
    for (int num : nums) {
        if (frequencyMap.get(num) == 1) {
            sum += num;
        }
    }
    
    return sum;
        
    }
}