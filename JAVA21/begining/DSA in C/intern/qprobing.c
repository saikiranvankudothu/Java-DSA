#include <stdio.h>
#include <stdlib.h>

#define TABLE_SIZE 10

int h[TABLE_SIZE] = {0};

void insert() {
    int key, index, i, hkey;
    
    printf("\nEnter a value to insert into the hash table: ");
    scanf("%d", &key);
    
    hkey = key % TABLE_SIZE;
    
    for (i = 0; i < TABLE_SIZE; i++) {
        index = (hkey + i * i) % TABLE_SIZE;
        if (h[index] == 0) {
            h[index] = key;
            break;
        }
    }
    
    if (i == TABLE_SIZE)
        printf("\nElement cannot be inserted.\n");
}

void search() {
    int key, index, i, hkey;
    
    printf("\nEnter the element to search: ");
    scanf("%d", &key);
    
    hkey = key % TABLE_SIZE;
    
    for (i = 0; i < TABLE_SIZE; i++) {
        index = (hkey + i * i) % TABLE_SIZE;
        if (h[index] == key) {
            printf("Value found at index %d\n", index);
            break;
        }
    }
    
    if (i == TABLE_SIZE)
        printf("\nValue not found.\n");
}

void display() {
    int i;
    
    printf("\nElements in the hash table are:\n");
    
    for (i = 0; i < TABLE_SIZE; i++)
        printf("At index %d: Value = %d\n", i, h[i]);
}

int main() {
    int opt;
    
    while (1) {
        printf("\nPress 1. Insert\t 2. Display \t3. Search \t4. Exit\n");
        scanf("%d", &opt);
        
        switch (opt) {
            case 1:
                insert();
                break;
            case 2:
                display();
                break;
            case 3:
                search();
                break;
            case 4:
                exit(0);
        }
    }
    
    return 0;
}
