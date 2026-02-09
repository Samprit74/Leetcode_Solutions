/*
LeetCode 724 - Find Pivot Index

Return the pivot index where the sum of elements
to the left equals the sum of elements to the right.
If no such index exists, return -1.
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;

        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) return i;
            left += nums[i];
        }

        return -1;
    }
}
