#include<stdio.h>

void StrCopyX(char *str, char *dest)
{
    while(*str != '\0')
    {
        *dest = *str;
        str++;
        dest++;
    }
    *dest = '\0';
}

int main()
{
    char arr[30];
    char brr[30];

    printf("Enter string:\n");
    scanf("%[^'\n]s",arr);

    StrCopyX(arr,brr);

    printf("%s\n",brr);

    return 0;
}