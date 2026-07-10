#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;

void DisplayEven(PNODE Head)
{
    while(Head != NULL)
    {
        if((Head->data % 2) == 0)
        {
            printf("| %d | -> ",Head->data);
        }

        Head = Head->next;
    }

    printf("NULL\n");
}