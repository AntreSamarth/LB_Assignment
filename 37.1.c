#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef unsigned int UINT;
typedef int BOOL;

BOOL ChkBit(UINT iNo, int iPos)
{
    UINT Mask = 0;

    if((iPos < 1) || (iPos > 32))
    {
        return FALSE;
    }

    Mask = 1 << (iPos - 1);

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
    UINT Position = 0;
    BOOL bRet = FALSE;

    printf("Enter the number:\n");
    scanf("%u",&Value);

    printf("Enter the bit position:\n");
    scanf("%u",&Position);
    
    bRet = ChkBit(Value, Position);

    if(bRet = TRUE)
    {
        printf("Bit is ON\n");
    }
    else
    {
        printf("Bit is OFF\n");
    }
    
    return 0;
}