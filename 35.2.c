#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT Mask1 = 1 << 4;
    UINT Mask2 = 1 << 17;

    if(iNo & Mask1)
    {
        printf("5th bit is ON\n");
    }
    else
    {
        printf("5th bit is OFF\n");
    }

    if(iNo & Mask2)
    {
        printf("18th bit is ON\n");
    }
    else
    {
        printf("18th bit is OFF\n");
    }
}


int main()
{
    UINT No = 0;
    BOOL bRet = FALSE;

    printf("Enter number : \n");
    scanf("%u", &No);

    bRet = ChkBit(No);

    return 0;
}