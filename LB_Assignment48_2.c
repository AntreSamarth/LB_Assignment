#include<stdio.h>

void CreateFile(char FName[])
{
    FILE *fp = NULL;

    fp = fopen(FName, "w");

    if(fp == NULL)
    {
        printf("Unable to create file\n");
        return;
    }

    printf("File created successfully\n");

    fclose(fp);
}

int main()
{
    char FileName[30];

    printf("Enter file name: ");
    scanf("%s", FileName);

    CreateFile(FileName);

    return 0;
}