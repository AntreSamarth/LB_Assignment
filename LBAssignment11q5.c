#include<stdio.h>

void RangeDisplayRev(int iStart, int iEnd)
{
    int iCnt = 0;
    int iTemp = 0;

    if((iStart <= 0) || (iEnd <= 0))
    {
        printf("Invalid Input");
        return;
    }

    if(iStart > iEnd)
    {
        iTemp = iStart;
        iStart = iEnd;
        iEnd = iTemp;
    }

    for(iCnt = iEnd; iCnt >= iStart; iCnt--)
    {
        printf("%d\t", iCnt);
    }
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter Starting Point:\n");
    scanf("%d",&iValue1);

    printf("Enter Ending Point:\n");
    scanf("%d",&iValue2);

    RangeDisplayRev(iValue1, iValue2);

    return 0;
}