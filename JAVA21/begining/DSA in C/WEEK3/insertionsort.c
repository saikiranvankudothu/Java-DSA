#include<stdio.h>
void Insertionsort(int arr[],int n){
    int key,i,j;
    for(i=1;i<n;i++){
        key = arr[i];
        j=i-1;
    
    while(j>=0 && arr[j]>key){
        arr[j+1] = arr[j];
        j = j-1;
        }
    arr[j+1] = key;
    }
}

int main(){
    int n;
    printf("Enter the size of the array:");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements in the array:");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    Insertionsort(arr,n);
    printf("Insertion Sorted Array:");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");

    return 0;
}