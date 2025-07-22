#include<stdio.h>

void hanoi(int n,char source,char destination,char intermediate){
    if(n==1){
        printf("the disk 1 move from %c to %c\n",source,destination);
        return;
    }
    else{
        hanoi(n-1,source,intermediate,destination);
        printf("move %d form %c to %c!\n",n,source,destination);
        hanoi(n-1,intermediate,destination,source);
    }
}
int main(){
    int n;
    printf("Enter thr no. of disks in the hanoi:");
    scanf("%d",&n);
    hanoi(n,'S','D','I');
    return 0;
}