#include<stdio.h>
#include<stdlib.h>
#define SIZE 10
int hash(int key){
    return key%SIZE;
}
void insertlinearprobing(int hashtable[],int key){
    int index = hash(key);
    while(hashtable[index]!=-1){
        index = (index+1)%SIZE;
    }
    hashtable[index]=key;
}
int searchlinearprobing(int hashtable[],int key){
    int index = hash(index);
    int originalindex = index;
    while(hashtable[index] != key){
        index = (index+1)%SIZE;
        if(index == originalindex){
            return -1;
        }
    }
    return index;
}
void displayhashtable(int hashtable[]){
    printf("Hash Table:\n");
    for(int i=0;i<SIZE;i++){
        printf("%d: %d\n",i,hashtable[i]);
    }
}
int main(){
    int hashtable[SIZE];
    for (int i = 0; i < SIZE; i++) {
        hashtable[i] = -1;
    }
    insertlinearprobing(hashtable,5);
    insertlinearprobing(hashtable,45);
    insertlinearprobing(hashtable,15);
    insertlinearprobing(hashtable,55);

    displayhashtable(hashtable);

    int keytosearch = 15;
    int searchresult = searchlinearprobing(hashtable,keytosearch);
    if(searchresult != 1){
        printf("key %d found at the location %d.\n",keytosearch,searchresult);
    }else{
        printf("key %d not found in the hash table\n.",keytosearch);
    }
    return 0;
}