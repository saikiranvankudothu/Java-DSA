#include<stdio.h>
#define SIZE 10
int queue[SIZE];
int front = -1;
int rear = -1;

int  isEmpty(){
    return (front==-1 && rear ==-1);
}
int isFull(){
    return rear == SIZE-1;
}
void enqueue(int value){
    if(isFull()){
        printf("overflow occured!");
    }else{
        if(isEmpty()){
            front=rear=0;
        }
        else{
            rear++;
        }
        queue[rear]=value;
        printf("%d enqueued to the queue!\n",value);
    }
}
void dequeue(){
    if(isEmpty()){
        printf("underflow occured!");
    }else{
        printf("%d dequeued from the queue\n");
        if(isFull()){
            front==rear;
            front=rear = -1;
        }
        else{
            front++;
        }

    }
}
void display(){
    int i;
    if(isEmpty()){
        printf("the queue is empty!");
    }
    else{
        printf("the queue values are:");
        for(i=front;i<=rear;i++){
            printf("%d ",queue[i]);
    }
    printf("\n");
    }
}

int main(){
    enqueue(10);
    enqueue(20);
    enqueue(30);
    display();
    dequeue();
    display();
    enqueue(40);
    display();
    return 0;
}