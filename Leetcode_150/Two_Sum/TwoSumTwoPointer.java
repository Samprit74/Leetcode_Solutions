import java.util.*;

public class TwoSumTwoPointer {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // Store original indices
        int[][] numWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }

        // Sort based on values
        Arrays.sort(numWithIndex, Comparator.comparingInt(a -> a[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                return new int[] {numWithIndex[left][1], numWithIndex[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target))); // [1,2]
    }
}
//Time: O(n log n) (due to sorting)
//Space: O(n) (to track original indices)
