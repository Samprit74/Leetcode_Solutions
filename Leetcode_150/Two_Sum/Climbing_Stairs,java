// You are climbing a staircase. Each time you can climb 1 or 2 steps. Return the number of distinct ways to reach the top.

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}
