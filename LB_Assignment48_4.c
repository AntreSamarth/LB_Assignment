#include<stdio.h>

int FileSize(char FName[])
{
    FILE *fp = NULL;
    char ch;
    int Count = 0;

    fp = fopen(FName, "r");

    if(fp == NULL)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((ch = fgetc(fp)) != EOF)
    {
        Count++;
    }

    fclose(fp);

    return Count;
}

int main()
{
    char FileName[30];
    int iRet = 0;

    printf("Enter file name: ");
    scanf("%s", FileName);

    iRet = FileSize(FileName);

    if(iRet != -1)
    {
        printf("Size of file is %d bytes\n", iRet);
    }

    return 0;
}