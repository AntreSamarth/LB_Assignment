#include<stdio.h>
#include<string.h>

void Reverse(char *str)
{
    int iEnd = 0;
    
    while(str[iEnd] != '\0')
    {
        iEnd++;
    }

    iEnd--;

    while(iEnd >= 0)
    {
        printf("%c", str[iEnd]);
        iEnd--;
    }

    printf("\n");
}

int main()
{
    char arr[20];

    printf("Enter string:\n");
    scanf(" %[^\n]", arr);

    Reverse(arr);

    return 0;
}