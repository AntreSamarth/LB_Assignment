#include<stdio.h>

void StrCatX(char *src, char *dest)
{
    while(*src != '\0')
    {
        src++;
    }

    while(*dest != '\0')
    {
        *src = *dest;
        src++;
        dest++;
    }

    *src = '\0';
}

int main()
{
    char arr[50];
    char brr[50];

    printf("Enter first string:\n");
    scanf("%[^'\n']s",arr);

    getchar();

    printf("Enter second string:\n");
    scanf("%[^'\n]s",brr);

    StrCatX(arr,brr);

    printf("%s\n",arr);

    return 0;
}