#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;

int LastOccur(PNODE head, int No)
{
    int iPos = 1;
    int iLast = -1;

    while(head != NULL)
    {
        if(head->data == No)
        {
            iLast = iPos;
        }

        iPos++;
        head = head->next;
    }

    return iLast;
}