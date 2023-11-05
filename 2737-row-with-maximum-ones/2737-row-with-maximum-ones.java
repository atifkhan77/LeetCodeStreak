class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnesRow = 0; // Index of the row with the maximum count of ones
    int maxOnesCount = 0; // Maximum count of ones found
    
    for (int i = 0; i < mat.length; i++) {
        int onesCount = 0; // Count of ones in the current row
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] == 1) {
                onesCount++;
            }
        }
        
        if (onesCount > maxOnesCount || (onesCount == maxOnesCount && i < maxOnesRow)) {
            // Update the maximum count of ones and the corresponding row index
            maxOnesCount = onesCount;
            maxOnesRow = i;
        }
    }
    
    int[] result = { maxOnesRow, maxOnesCount };
    return result;
        
    }
}