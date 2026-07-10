#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;

int Frequency(PNODE Head, int No)
{
    int iCount = 0;

    while(Head != NULL)
    {
        if(Head->data == No)
        {
            iCount++;
        }

        Head = Head->next;
    }

    return iCount;
}