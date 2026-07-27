#include<stdio.h>

int Small(char *str)
{
    if(*str == '\0')
    {
        return 0;
    }
    else if((*str >= 'a') && (*str <= 'z'))
    {
        return 1 + Small(str + 1);
    }
    else
    {
        return Small(str + 1);
    }
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%s",arr);

    iRet = Small(arr);

    printf("Number of small characters are : %d\n",iRet);

    return 0;
}