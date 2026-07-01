#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT Mask = (1 << 8) | (1 << 11);

    if((iNo & Mask) == Mask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    UINT Value = 0;
    BOOL bRet = FALSE;

    printf("Enter the number:\n");
    scanf("%u", &Value);

    bRet = ChkBit(Value);

    if(bRet == TRUE)
    {
        printf("Both 9th and 12th bits are ON\n");
    }
    else
    {
        printf("Both 9th and 12th bits are not ON\n");
    }

    return 0;
}