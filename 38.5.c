#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleRange(UINT iNo, int iStart, int iEnd)
{
    UINT Mask = 0;
    int iRange = 0;

    if((iStart < 1) || (iEnd > 32) || (iStart > iEnd))
    {
        return iNo;
    }

    iRange = iEnd - iStart + 1;

    Mask = ((1U << iRange) - 1) << (iStart - 1);

    iNo = iNo ^ Mask;

    return iNo;
}

int main()
{
    UINT Value = 0;
    int Start = 0, End = 0;
    UINT Ret = 0;

    printf("Enter the number:\n");
    scanf("%u", &Value);

    printf("Enter start position:\n");
    scanf("%d", &Start);

    printf("Enter end position:\n");
    scanf("%d", &End);

    Ret = ToggleRange(Value, Start, End);

    printf("Modified number is: %u\n", Ret);

    return 0;
}