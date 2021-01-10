// import javax.naming.directory.SearchControls;

public class BinarySearch {
    static int search(int arr[], int tar) {
        int l = 0, r = arr.length;
        while (l <= r) {
            int mid = (l + r) / 2;
            // System.out.printf("%d %d %d %d%n",arr[mid],mid,l,r);
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    static int search2(int arr[], int tar, int l, int r) {
        if(l>r){
            return -1;
        }
        int mid = (r + l) / 2;
        if (arr[mid] == tar) {
            return mid;
        } else if (arr[mid] > tar) {
            return search2(arr, tar, l, mid - 1);
        }
        return search2(arr, tar, mid + 1, r);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int tar = 2;
        System.out.println(search(arr, tar));
        System.out.println(search2(arr, tar, 0, arr.length));
    }

}
