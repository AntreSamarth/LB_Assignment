#include<stdio.h>

void OpenFile(char FName[])
{
    FILE *fp = NULL;

    fp = fopen(FName, "r");

    if(fp == NULL)
    {
        printf("Unable to open file\n");
        return;
    }

    printf("File opened successfully in read mode\n");

    fclose(fp);
}

int main()
{
    char FileName[30];

    printf("Enter file name: ");
    scanf("%s", FileName);

    OpenFile(FileName);

    return 0;
}