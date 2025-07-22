#include <stdio.h>
#include <ctype.h>
#define MAX_SIZE 100

char stack[MAX_SIZE];
int top = -1;

void push(char x) {
    stack[++top] = x;
}

char pop() {
    if (top == -1)
        return -1;
    else
        return stack[top--];
}


int priority(char x) {
    if (x == '(')
        return 0;
    if (x == '+' || x == '-')
        return 1;
    if (x == '*' || x == '/')
        return 2;
    return 0;
}

void convertToPostfix(char exp[]) {
    char *e = exp;
    
    printf("Postfix Expression: ");
    
    while (*e != '\0') {
        if (isalnum(*e)) {
            printf("%c ", *e);
        } else if (*e == '(') {
            push(*e);
        } else if (*e == ')') {
            while ((top != -1) && (stack[top] != '(')) {
                printf("%c ", pop());
            }
            pop();
        } else {
            while ((top != -1) && (priority(stack[top]) >= priority(*e))) {
                printf("%c ", pop());
            }
            push(*e);
        }
        e++;
    }
    
    while (top != -1) {
        printf("%c ", pop());
    }
}

int main() {
    char exp[MAX_SIZE];
    
    printf("Enter the infix expression : ");
    scanf("%s", exp);
    
    convertToPostfix(exp);
    
    return 0;
}
