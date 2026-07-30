#include<stdio.h>

int CountWhiteSpace(char FName[])
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
        if(ch == ' ')
        {
            Count++;
        }
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

    iRet = CountWhiteSpace(FileName);

    if(iRet != -1)
    {
        printf("Number of White Spaces are %d\n", iRet);
    }

    return 0;
}