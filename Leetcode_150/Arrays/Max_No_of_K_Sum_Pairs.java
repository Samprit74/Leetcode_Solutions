/*
LeetCode 1679 - Max Number of K-Sum Pairs

Find the maximum number of operations
where each operation removes two numbers
that sum to k.
*/

import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int n : nums) {
            int need = k - n;

            if (map.getOrDefault(need, 0) > 0) {
                count++;
                map.put(need, map.get(need) - 1);
            } else {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }

        return count;
    }
}
