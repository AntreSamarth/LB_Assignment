#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT Mask1 = 1 << 0;
    UINT Mask2 = 1 << 31; 

    if(iNo & Mask1)
    {
        printf("1st bit is ON\n");
    }
    else
    {
        printf("1st bit is OFF\n");
    }

    if(iNo & Mask2)
    {
        printf("31st bit is ON\n");
    }
    else
    {
        printf("31st bit is OFF\n");
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