#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;

int CountOdd(PNODE Head)
{
    int iCount = 0;

    while(Head != NULL)
    {
        if((Head->data % 2) != 0)
        {
            iCount++;
        }

        Head = Head->next;
    }

    return iCount;
}