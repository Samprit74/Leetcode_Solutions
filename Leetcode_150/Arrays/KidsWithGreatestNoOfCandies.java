/*
LeetCode 1431 - Kids With the Greatest Number of Candies

Return a boolean list indicating whether each child
can have the greatest number of candies
after receiving extra candies.
*/

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) max = Math.max(max, c);

        List<Boolean> ans = new ArrayList<>();
        for (int c : candies) {
            ans.add(c + extraCandies >= max);
        }

        return ans;
    }
}
