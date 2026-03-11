class MinAbsoluteDifference {

    static int minDiff(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return 0;

            else if (arr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }

        // Only ceil exists
        if (high < 0)
            return Math.abs(arr[low] - target);

        // Only floor exists
        if (low >= arr.length)
            return Math.abs(arr[high] - target);

        // Both exist
        return Math.min(Math.abs(arr[high] - target),
                        Math.abs(arr[low] - target));
    }

    public static void main(String[] args) {

        int arr[] = {2,5,8,12,16};
        int target = 10;

        System.out.println(minDiff(arr, target));
    }
}
