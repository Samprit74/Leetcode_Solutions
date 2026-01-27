// Given an integer array nums, return the maximum amount you can rob without robbing adjacent houses.

class Solution {
    public int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;
        for (int n : nums) {
            int temp = Math.max(prev1, prev2 + n);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}
