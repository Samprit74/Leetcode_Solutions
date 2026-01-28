// Question:
// Given an array consisting only of 0s, 1s, and 2s,
// sort the array in-place without using any extra space.
// The solution must run in a single pass (O(n) time).
// This is known as the Dutch National Flag problem.

class Main {

    Main(String word) {
        System.out.println("Hola " + word + "!!!");
    }

    private void swap(int arr[], int f, int l) {
        arr[f] = (arr[f] + arr[l]) - (arr[l] = arr[f]);
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 2, 0, 0, 0, 2, 1, 1, 2};
        int start = 0, mid = 0, end = arr.length - 1;

        Main obj = new Main("Folks");

        while (mid <= end) {
            if (arr[mid] == 0) {
                obj.swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] == 2) {
                obj.swap(arr, end, mid);
                end--;
            } else {
                mid++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
