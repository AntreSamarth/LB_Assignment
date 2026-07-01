#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT Mask = 0;

    Mask = 0x0F;          
    Mask = Mask | (0x0F << 28);   

    iNo = iNo ^ Mask;

    return iNo;

}

int main()
{
    UINT Value = 0;
    UINT Ret = 0;

    printf("Enter the number:\n");
    scanf("%u",&Value);
    
    Ret = ToggleBit(Value);

    printf("Modifies number is:%u",Ret);
    
    return 0;
}