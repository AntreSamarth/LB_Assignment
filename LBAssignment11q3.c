#include<stdio.h>

int RangeSum(int iStart, int iEnd)
{
    int iCnt = 0;
    int iSum = 0;
    int iTemp = 0;

    if(iStart > iEnd)
    {
        iTemp = iStart;
        iStart = iEnd;
        iEnd = iTemp;
    }

    
    if((iStart <= 0) || (iEnd <= 0))
    {
        return -1;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iSum = iSum + iCnt;
    }

    return iSum;
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;

    printf("Enter Starting Point:\n");
    scanf("%d", &iValue1);

    printf("Enter Ending Point:\n");
    scanf("%d", &iValue2);

    iRet = RangeSum(iValue1, iValue2);

    if(iRet == -1)
    {
        printf("Invalid Input\n");
    }
    else
    {
        printf("Sum of numbers in range is : %d\n", iRet);
    }

    return 0;
}