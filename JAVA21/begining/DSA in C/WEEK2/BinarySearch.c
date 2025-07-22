#include<stdio.h>
int binarysearch(int arr[],int target,int low,int high){
    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return -1;
}
int main(){
    int n,target;
    printf("enter the size of the array:");
    scanf("%d",&n);
    int arr[n];
    printf("insert the numbers in the array:");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("enter the element to search:");
    scanf("%d",&target);
    int result = binarysearch(arr,target,0,n-1);
    if (result!=-1){
        printf("element %d found at the location %d",target,result+1);
    }else{
        printf("the element %d not found in the list!",target);
    }
    return 0;

}