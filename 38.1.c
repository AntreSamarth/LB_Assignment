#include<stdio.h>

typedef unsigned int UINT;

UINT CountONBits(UINT iNo)
{
    UINT iCount = 0;

    while(iNo != 0)
    {
        if((iNo & 1) == 1)
        {
            iCount++;
        }

        iNo = iNo >> 1;
    }

    return iCount;
}

int main()
{
    UINT Value = 0;
    UINT Ret = 0;

    printf("Enter the number:\n");
    scanf("%u", &Value);

    Ret = CountONBits(Value);

    printf("Number of ON bits is: %u\n", Ret);

    return 0;
}