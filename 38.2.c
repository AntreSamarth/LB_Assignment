#include<stdio.h>

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{
    UINT Result = 0;
    UINT Mask = 1;
    int i = 0;

    Result = iNo1 & iNo2;

    printf("Common ON bit positions are:\n");

    for(i = 1; i <= 32; i++)
    {
        if((Result & Mask) == Mask)
        {
            printf("%d ", i);
        }

        Mask = Mask << 1;
    }
}

int main()
{
    UINT Value1 = 0;
    UINT Value2 = 0;

    printf("Enter first number:\n");
    scanf("%u", &Value1);

    printf("Enter second number:\n");
    scanf("%u", &Value2);

    CommonBits(Value1, Value2);

    return 0;
}