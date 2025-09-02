import java.util.*;

public class TwoSumBinarySearch {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] numWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }

        Arrays.sort(numWithIndex, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            int needed = target - numWithIndex[i][0];
            int idx = Arrays.binarySearch(numWithIndex, i + 1, n, new int[]{needed, 0}, Comparator.comparingInt(a -> a[0]));
            if (idx >= 0) {
                return new int[] {numWithIndex[i][1], numWithIndex[idx][1]};
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
//Time: O(n log n) (sorting + binary search for each element)
//Space: O(n)
