// import java.text.Format;

public class LinearSearch {
    public static char[] search(int arr[],int tar){
        for (int i = 0; i < arr.length; i++) {
            if(tar == arr[i]){
                return String.format("Element x is present at index %d",i).toCharArray();
            }
        }
        return "Element x is not present in arr[].".toCharArray();
    }
    public static int search2(int arr[],int tar,int now,int l) {
        if(now == l){
            return -1;
        }
        else if(arr[now] == tar){
            return now;
        }
        else{
            return search2(arr,tar,now+1,l);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        // char res[] = search(arr,175);
        // System.out.println(res);
        System.out.println(search2(arr, 170, 0, arr.length));
        // for(int i = 0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
}
