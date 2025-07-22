#include<stdio.h>
int main(){
    int factorial(int);
    int n,f;
    printf("enter the number:");
    scanf("%d",&n);
    // printf("\n enter the second number:");
    // scanf("%d",&n2);
    f = factorial(n);
    printf("the factorial of %d is %d:",n,f);
    return 0;
}
int factorial(int n){
    if(n==1){
        return 1;
    }
    else{
        int f = n*factorial(n-1);
        return f;
    }
}