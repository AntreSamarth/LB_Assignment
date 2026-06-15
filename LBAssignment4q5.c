#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;

    int iFactSum = 0;

    int inonFactSum = 0;

    for(iCnt=1; iCnt < iNo; iCnt++)
    {
        if(iNo % iCnt ==0)
        {
            iFactSum = iFactSum + iCnt;
        }
        else
        {
            inonFactSum = inonFactSum + iCnt;
        }
    }

    return iFactSum - inonFactSum;
}

int main()
{
    int iValue = 0;
    
    int iRet = 0;

    printf("Enter Number:");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("Difference is : %d", iRet);
    
    return 0;
}