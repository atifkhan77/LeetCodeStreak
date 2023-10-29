class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
    for (int i = 0; i < n; i++) {
        int left = 0; 
        int right = n - 1;
        
        while (left <= right) {
            int temp = image[i][left];
            image[i][left] = 1 - image[i][right]; 
            image[i][right] = 1 - temp; 
            left++;
            right--;
        }
    }
    
    return image;
        
    }
}