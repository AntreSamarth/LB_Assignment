#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT Mask1 = 1 << 6;
    UINT Mask2 = 1 << 14;
    UINT Mask3 = 1 << 20;
    UINT Mask4 = 1 << 27; 

    if(iNo & Mask1)
    {
        printf("7th bit is ON\n");
    }
    else
    {
        printf("7th bit is OFF\n");
    }

    if(iNo & Mask2)
    {
        printf("15th bit is ON\n");
    }
    else
    {
        printf("15th bit is OFF\n");
    }

    if(iNo & Mask3)
    {
        printf("21th bit is ON\n");
    }
    else
    {
        printf("21th bit is OFF\n");
    }

    if(iNo & Mask4)
    {
        printf("28th bit is ON\n");
    }
    else
    {
        printf("28th bit is OFF\n");
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