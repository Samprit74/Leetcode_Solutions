/*
LeetCode 198 - House Robber

You are given an array where each element represents money in a house.
You cannot rob two adjacent houses.
Return the maximum money you can rob.
*/

class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for (int n : nums) {
            int temp = Math.max(prev1, prev2 + n);
            prev2 = prev1;
            prev1 = temp;
        }

        return prev1;
    }
}
