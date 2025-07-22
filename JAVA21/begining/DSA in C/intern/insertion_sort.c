#include<stdio.h>
void insertionsort(int arr[],int size){
    int i,key,j;
    for(i=1;i<size;i++){
        key = arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j = j-1;
    }
    arr[j+1]=key;
    }
}

int main(){
    int arr[]={64,65,26,12,13};
    int size = sizeof(arr)/sizeof(arr[0]);
    printf("Original Array: \n");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    insertionsort(arr,size);
    printf("\nSorted Array:\n");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}