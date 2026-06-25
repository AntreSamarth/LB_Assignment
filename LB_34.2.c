#include<stdio.h>

void StrNCpyX(char *src, char *dest, int iCnt)
{
    while((*src != '\0') && (iCnt != 0))
    {
        *dest = *src;
        dest++;
        src++;
        iCnt--;
    }
    *dest != '\0';
}

int main()
{
    char arr[30] = "Marvellous multi OS";
    char brr[30] =  {'\0'};
    int iValue = 0;

    printf("Enter string:\n");
    scanf("%[^'\n]s",arr);

    printf("Enter number of character to copy: \n");
    scanf("%d",&iValue);

    StrNCpyX(arr, brr, iValue);

    printf("%s\n",brr);
    
    return 0;
}