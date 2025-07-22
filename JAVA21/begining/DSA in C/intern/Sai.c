#include<stdio.h>
int gcd_recursive(inta,intb)
{
    if(b==0)
    {
        return a;
    }
    else
    {
        return gcd_recursive(b,a%b);
    }
}
int main()
{
    int num1,num2;
    printf("enter the first integer:");
    scanf("%d",&num1);
    printf("enter the second integer:");
    scanf("%d",&num2);
    int result=gcd_recursive(num1,num2);
    printf("the gcd of %d and %d is:%d\n",num1,num2,result);
    return 0;
}
    