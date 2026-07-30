#include<stdio.h>

void DisplayFile(char FName[])
{
    FILE *fp = NULL;
    char ch;

    fp = fopen(FName, "r");

    if(fp == NULL)
    {
        printf("Unable to open file\n");
        return;
    }

    while((ch = fgetc(fp)) != EOF)
    {
        printf("%c", ch);
    }

    fclose(fp);
}

int main()
{
    char FileName[30];

    printf("Enter file name: ");
    scanf("%s", FileName);

    DisplayFile(FileName);

    return 0;
}