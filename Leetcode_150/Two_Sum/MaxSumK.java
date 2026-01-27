
// Given an integer array nums and an integer k, return the maximum sum of a subarray of size k.

class Solution {
    public int maxSum(int[] nums, int k) {
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k - 1) {
                max = Math.max(max, sum);
                sum -= nums[i - k + 1];
            }
        }
        return max;
    }
}
