#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT Mask = 1 << 6;

    if((iNo & Mask) == Mask)
    {
        iNo = iNo & (~Mask);
    }
    return iNo;
}

int main()
{
    UINT Value = 0;
    UINT Ret = 0;

    printf("Enter the number:\n");
    scanf("%u",&Value);

    Ret = OffBit(Value);

    printf("Enter modified number:%u\n",Ret);

    return 0;
}