#include<stdio.h>

void ReadFile(char FName[], int iCount)
{
    FILE *fp = NULL;
    char ch;
    int i = 0;

    fp = fopen(FName, "r");

    if(fp == NULL)
    {
        printf("Unable to open file\n");
        return;
    }

    while((i < iCount) && ((ch = fgetc(fp)) != EOF))
    {
        printf("%c", ch);
        i++;
    }

    fclose(fp);
}

int main()
{
    char FileName[30];
    int iValue = 0;

    printf("Enter file name: ");
    scanf("%s", FileName);

    printf("Enter number of characters to read: ");
    scanf("%d", &iValue);

    ReadFile(FileName, iValue);

    return 0;
}