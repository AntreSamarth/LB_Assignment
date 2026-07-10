#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;

bool Search(PNODE Head, int No)
{
    while(Head != NULL)
    {
        if(Head->data == No)
        {
            return true;
        }

        Head = Head->next;
    }

    return false;
}