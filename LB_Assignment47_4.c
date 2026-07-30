#include<stdio.h>

int CountChar(char FName[], char chSearch)
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
        if(ch == chSearch)
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
    char ch;
    int iRet = 0;

    printf("Enter file name: ");
    scanf("%s", FileName);

    printf("Enter character to search: ");
    scanf(" %c", &ch);

    iRet = CountChar(FileName, ch);

    if(iRet != -1)
    {
        printf("Number of occurrences of '%c' are %d\n", ch, iRet);
    }

    return 0;
}