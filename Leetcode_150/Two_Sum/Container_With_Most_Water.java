// Given n non-negative integers height[] where each represents a vertical line,
//find two lines that together with the x-axis form a container that holds the most water.

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            max = Math.max(max, h * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
