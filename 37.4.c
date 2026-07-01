#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, int iPos)
{
    UINT Mask = 0;

    if((iPos < 1) || (iPos > 32))
    {
        return iNo;
    }

    Mask = 1 << (iPos - 1);

    iNo = iNo ^ Mask;

    return iNo;

}

int main()
{
    UINT Value = 0;
    UINT Position = 0;
    UINT Ret = 0;

    printf("Enter the number:\n");
    scanf("%u",&Value);

    printf("Enter the bit position:\n");
    scanf("%u",&Position);
    
    Ret = ToggleBit(Value, Position);

    printf("Modifies number is:%u",Ret);
    
    return 0;
}