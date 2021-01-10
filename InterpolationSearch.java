public class InterpolationSearch {
    static int search(int arr[], int tar) {
        // pos = lo + (x - arr[lo]) *(hi - lo)/(arr[hi] - arr[lo])
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int pos = l + (tar - arr[l]) * (r - l) / (arr[r] - arr[l]);
            if (arr[pos] == tar) {
                return pos;
            } else if (arr[pos] > tar) {
                r = pos - 1;
            } else {
                l = pos + 1;
            }
        }

        return -1;
    }

    static int search2(int arr[], int tar, int l, int r) {
        if (l > r) {
            return -1;
        }
        int pos = l + (tar - arr[l]) * (r - l) / (arr[r] - arr[l]);
        if (arr[pos] == tar) {
            return pos;
        } else if (arr[pos] > tar) {
            return search2(arr, tar, l, pos - 1);
        }
        return search2(arr, tar, pos + 1, r);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        System.out.println(search(arr, 16));
        System.out.println(search(arr, 2));
        System.out.println(search(arr, 91));
        System.out.println(search(arr, 92));
        System.out.println(search(arr, 0));
        System.out.println(search2(arr, 16, 0, arr.length - 1));
        System.out.println(search2(arr, 2, 0, arr.length - 1));
        System.out.println(search2(arr, 91, 0, arr.length - 1));
        System.out.println(search2(arr, 92, 0, arr.length - 1));
        System.out.println(search2(arr, 0, 0, arr.length - 1));

    }
}
