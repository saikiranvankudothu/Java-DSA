#include<stdio.h>
#include<stdlib.h>
#define SIZE 10
int hash(int key){
    return key%SIZE;
}
void insertquadraticprobing(int hashtable[],int key){
    int index = hash(key);
    int originalindex = index;
    int i = 1;
    while(hashtable[index]!=-1){
        index =(originalindex+i*i)%SIZE;
        i++;
        if(index == originalindex){
            printf("the hash table is full.unable to insert key %d.\n",key);
            return ;
        }
    }
    hashtable[index] = key;
}
int searchquadraticprobing(int hashtable[],int key){
    int index = hash(key);
    int originalindex = index;
    int i = 1;
    while(hashtable[index] != key){
        index = (originalindex+i*i)%SIZE;
        i++;
        if(index == originalindex){
            return -1;
        }
    }
    return index;
}
void displayhashtable(int hashtable[]){
    printf("HASH TABLE:\n");
    for(int i=0;i<SIZE;i++){
        printf("%d:%d\n",i,hashtable[i]);
    }
}
int main(){
    int hashtable[SIZE];

    for(int i=0;i<SIZE;i++){
        hashtable[i] = -1;
    }
    insertquadraticprobing(hashtable,5);
    insertquadraticprobing(hashtable,15);
    insertquadraticprobing(hashtable,25);
    insertquadraticprobing(hashtable,35);
    
    displayhashtable(hashtable);

    int keytosearch = 25;
    int searchresult = searchquadraticprobing(hashtable,keytosearch);
    if(searchresult != -1){
        printf("key %d found at the index %d.\n",keytosearch,searchresult);
    }else{
        printf("key %d not found in the hash table.\n",keytosearch);
    }
    return 0;
}