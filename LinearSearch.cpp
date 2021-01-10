#include<bits/stdc++.h>
using namespace std;
int search(vector<int> arr,int tar){
    for(int i =0;i<arr.size();i++){
        if(arr[i] == tar){
            return i;
        }
    }
    return -1;
}
int search2(vector<int> arr,int tar,int i,int end){
    if(i == end){
        return -1;
    }
    else if (arr[i] == tar)
    {
        return i;
    }
    return search2(arr,tar,i+1,end);
    
}
int main(){
    vector<int> arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
    cout<<search(arr,110)<<'\n';
    cout<<search2(arr,110,0,arr.size())<<'\n';
    return 0;
}