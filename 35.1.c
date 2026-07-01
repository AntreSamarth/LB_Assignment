#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT Mask = 1;

    Mask = Mask << 14;

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
    UINT No = 0;
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%u", &No);

    bRet = ChkBit(No);

    if(bRet == TRUE)
    {
        printf("15th bit is ON\n");
    }
    else
    {
        printf("15th bit is OFF\n");
    }

    return 0;
}