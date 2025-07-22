#include <stdio.h>
#include <stdbool.h>

#define MAX_SIZE 10

struct Queue {
    int arr[MAX_SIZE];
    int front, rear;
};

void initialize(struct Queue *queue) {
    queue->front = -1;
    queue->rear = -1;
}

bool isEmpty(struct Queue *queue) {
    return (queue->front == -1 && queue->rear == -1);
}

bool isFull(struct Queue *queue) {
    return (queue->rear + 1) % MAX_SIZE == queue->front;
}

void enqueue(struct Queue *queue, int value) {
    if (isFull(queue)) {
        printf("Queue Overflow: Cannot enqueue %d, queue is full.\n", value);
    } else {
        if (isEmpty(queue)) {
            queue->front = 0; // Set front to 0 when enqueueing the first element
        }
        queue->rear = (queue->rear + 1) % MAX_SIZE;
        queue->arr[queue->rear] = value;
        printf("Enqueued %d into the queue.\n", value);
    }
}

void dequeue(struct Queue *queue) {
    if (isEmpty(queue)) {
        printf("Queue Underflow: Cannot dequeue from an empty queue.\n");
    } else {
        int dequeuedValue = queue->arr[queue->front];
        printf("Dequeued %d from the queue.\n", dequeuedValue);

        if (queue->front == queue->rear) {
            // Reset front and rear to -1 when the last element is dequeued
            queue->front = -1;
            queue->rear = -1;
        } else {
            queue->front = (queue->front + 1) % MAX_SIZE;
        }
    }
}

void display(struct Queue *queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty.\n");
    } else {
        printf("Queue: ");
        int i = queue->front;
        do {
            printf("%d ", queue->arr[i]);
            i = (i + 1) % MAX_SIZE;
        } while (i != (queue->rear + 1) % MAX_SIZE);
        printf("\n");
    }
}

int main() {
    struct Queue queue;
    initialize(&queue);
    
    enqueue(&queue, 10);
    enqueue(&queue, 20);
    display(&queue);
    
    dequeue(&queue);
    dequeue(&queue);
    
    return 0;
}
