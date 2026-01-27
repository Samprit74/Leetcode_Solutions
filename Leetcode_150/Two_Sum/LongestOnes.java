// Given a binary array nums and an integer k, return the maximum number of consecutive 1s if you can flip at most k zeros.

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, zeros = 0, max = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;
            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
