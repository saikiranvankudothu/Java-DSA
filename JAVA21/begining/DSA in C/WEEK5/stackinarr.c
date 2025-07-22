#include<stdio.h>
#include<stdlib.h>
#define SIZE 10;
struct Stack{
    int arr[SIZE];
    int top;
};
void intilalize(struct Stack *stack){
    stack->top = -1;
}
int isempty(struct Stack *stack){
    return stack->top == -1;
}
int isfull(struct Stack *stack){
    return stack-> == SIZE-1; 
}
void push(struct Stack *stack,int value){
    if(isFull(stack))
}

