#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT Mask1 = 1 << 6;
    UINT Mask2 = 1 << 7;
    UINT Mask3 = 1 << 9; 

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
        printf("8th bit is ON\n");
    }
    else
    {
        printf("8th bit is OFF\n");
    }

    if(iNo & Mask3)
    {
        printf("9th bit is ON\n");
    }
    else
    {
        printf("9th bit is OFF\n");
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