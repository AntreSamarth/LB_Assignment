#include<stdio.h>

typedef unsigned int UINT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, int iPos1, int iPos2)
{
    UINT Mask1 = 0;
    UINT Mask2 = 0;

    if((iPos1 < 1) || (iPos1 > 32) || (iPos2 < 1) || (iPos2 > 32))
    {
        return FALSE;
    }

    Mask1 = 1 << (iPos1 - 1);
    Mask2 = 1 << (iPos2 - 1);

    if((iNo & Mask1) == Mask1 || (iNo & Mask2) == Mask2)
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
    int Pos1 = 0, Pos2 = 0;
    BOOL bRet = FALSE;

    printf("Enter the number:\n");
    scanf("%u", &Value);

    printf("Enter first position:\n");
    scanf("%d", &Pos1);

    printf("Enter second position:\n");
    scanf("%d", &Pos2);

    bRet = ChkBit(Value, Pos1, Pos2);

    if(bRet == TRUE)
    {
        printf("Bit at first OR second position is ON\n");
    }
    else
    {
        printf("Both bits are OFF\n");
    }

    return 0;
}