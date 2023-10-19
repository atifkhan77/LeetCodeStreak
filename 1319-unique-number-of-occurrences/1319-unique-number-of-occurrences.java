class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
    
    // Populate the count map
    for (int num : arr) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }
    
    // Create a set to store unique counts
    Set<Integer> uniqueCounts = new HashSet<>();
    
    // Iterate through the values in the map and add their counts to the set
    for (int count : countMap.values()) {
        if (uniqueCounts.contains(count)) {
            return false; // Not unique
        } else {
            uniqueCounts.add(count);
        }
    }
    
    // Check if the size of the set is equal to the size of the map
    return uniqueCounts.size() == countMap.size();
    }
}