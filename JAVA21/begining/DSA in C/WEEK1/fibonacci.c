#include<stdio.h>
int main(){
    int n,f;
    int fibo(int);
    printf("enter the number:");
    scanf("%d",&n);
    f = fibo(n);
    printf("fibonaci series at %d position number is: %d.",n,f);
    scanf("%d",&f);
    return 0;
}
int fibo(int n){
    int a=0,b=1,c;
    if(n==0)
        return a;
    else{
        for (int i=2;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }    
}
