class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 3) {
        return true;
    }

    // Calculate the vector between the first two points.
    int x1 = coordinates[0][0];
    int y1 = coordinates[0][1];
    int x2 = coordinates[1][0];
    int y2 = coordinates[1][1];
    int deltaX = x2 - x1;
    int deltaY = y2 - y1;

    // Iterate through the rest of the points and check if their vectors are collinear.
    for (int i = 2; i < coordinates.length; i++) {
        int x = coordinates[i][0];
        int y = coordinates[i][1];

        // Calculate the vector between the current point and the first point.
        int currentDeltaX = x - x1;
        int currentDeltaY = y - y1;

        // Check if the cross product is not zero.
        if (deltaX * currentDeltaY != deltaY * currentDeltaX) {
            return false;
        }
    }

    // If all vectors are collinear, return true.
    return true;
    }
}