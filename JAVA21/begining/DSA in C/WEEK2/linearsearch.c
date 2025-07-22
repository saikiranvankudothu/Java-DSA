#include<stdio.h>
int linearserch(int arr[],int target,int n){
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            return i;
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
    int result = linearserch(arr,target,n);
    if (result!=-1){
        printf("element %d found at the location %d",target,result+1);
    }else{
        printf("the element %d not found in the list!",target);
    }
    return 0;

}