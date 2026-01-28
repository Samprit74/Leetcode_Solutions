// Rotate an array in-place without using extra space (Reversal Algorithm)

import java.util.Scanner;

class Main {

    static void reverse(int arr[], int f, int l) {
        if (f >= l) return;
        while (f < l) {
            arr[f] = (arr[f] + arr[l]) - (arr[l] = arr[f]);
            f++;
            l--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();

        int arr[] = new int[]{1, 2, 3, 4, 5};

        r = r % arr.length;   // handle rotations > length

        reverse(arr, 0, r - 1);
        reverse(arr, r, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
