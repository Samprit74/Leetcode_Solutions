// Given an integer array nums and an integer k, find the maximum sum of any contiguous subarray of size k.

class Solution {
    public int maxSumSubarray(int[] nums, int k) {
        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            windowSum += nums[i];

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= nums[i - (k - 1)];
            }
        }
        return maxSum;
    }
}
