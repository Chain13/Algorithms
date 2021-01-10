import java.lang.Math;

public class ExponentialSearch {
    static int search(int arr[], int tar) {
        if (arr[0] == tar) {
            return 0;
        }
        int i = 1;
        while (true) {
            if (i < arr.length && arr[i] == tar) {
                return i;
            } else if (i >= arr.length || arr[i] > tar) {
                return BinarySearch.search2(arr, tar, i / 2, Math.min(i, arr.length - 1));
            }
            i *= 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        for (int i = 0; i < arr.length; i++) {
        System.out.println(search(arr,arr[i]));

        }
        System.out.println(search(arr, 1));

    }
}
