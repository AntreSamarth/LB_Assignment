#include<stdio.h>

int SumNonFact(int iNo)
{
    int iCnt = 0;

    int iAdd = 0;

    for(iCnt= 1; iCnt < iNo; iCnt++)
    {
        if(iNo % iCnt != 0)
        {
            iAdd = iAdd + iCnt;
        }
    }

    return iAdd;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number: ");
    scanf("%d",&iValue);

    iRet = SumNonFact(iValue);

    printf("Addition of non factors is : %d", iRet);

    
    return 0;
}