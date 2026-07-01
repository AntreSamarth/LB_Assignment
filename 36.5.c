#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT Mask = 0x0000000F;

    iNo = iNo | Mask;

    return iNo;
}

int main()
{
    UINT Value = 0;
    UINT Ret = 0;
    
    printf("Enter the number:\n");
    scanf("%u",&Value);
    
    Ret = OffBit(Value);

    printf("Modified number is:%u",Ret);
    
    return 0;
}