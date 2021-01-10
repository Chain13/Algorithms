import java.lang.Math;
public class JumpSearch {
    static int search(int arr[],int tar){
        int jump = (int)Math.sqrt(arr.length);
        int l = 0,r=arr.length;
        while(l+jump <= r && arr[l+jump] <= tar){
            l += jump;
        }
        
        for(int i = 0; i<=jump && i+l<r ;i++){
            if(arr[i+l] == tar){
                return i+l;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        System.out.println(search(arr, -1));
    }
}
