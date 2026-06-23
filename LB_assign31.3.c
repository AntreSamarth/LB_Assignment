#include<stdio.h>

int CountCapital(char *str)
{
    int iCnt1 = 0;
    int iCnt2 = 0;

    while(*str != '\0')
    {
        if(*str >= 'A' && *str <= 'Z')
        {
            iCnt1++;
        }
        else if (*str >= 'a' && *str <= 'z')
        {
            iCnt2++;
        }
        str++;
    }

    return iCnt1 - iCnt2;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string: ");
    scanf("%[^'\n']s", arr);

    iRet = CountCapital(arr);

    printf("Number of capital letters = %d\n", iRet);

    return 0;
}