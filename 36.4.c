#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT Mask = (1 << 6) | (1 << 9);

    iNo = iNo ^ Mask;

    return iNo;
}

int main()
{
    UINT Value = 0;
    UINT Ret = 0;

    printf("Enter the number:\n");
    scanf("%u",&Value);

    Ret = OffBit(Value);

    printf("Modified value is: %u",Ret);

    return 0;
}