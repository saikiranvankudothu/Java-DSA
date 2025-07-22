#include<stdio.h>
void tower_of_hanoi(int n,char source,char Intermediate,char destination){
    if(n==1){
        printf("Move disk 1 from %c to %c\n",source,destination);
        return ;
    }
    tower_of_hanoi(n-1,source,destination,Intermediate);
    printf("move disk %d form %c to %c\n",n,source,destination);
    tower_of_hanoi(n-1,destination,Intermediate,source);

}
int main(){
    int  n;
    printf("Enter the no. of disks:");
    scanf("%d",&n);
    tower_of_hanoi(n,'A','B','C');
}