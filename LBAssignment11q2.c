#include<stdio.h>

int RangeEvenDisplay(int iStart, int iEnd)
{
    int iCnt = 0;

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if(iCnt % 2 ==0)
        {
            printf("%d\t", iCnt);
        }
        
        
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    
    printf("Enter Starting Point:\n");
    scanf("%d",&iValue1);

    printf("Enter Ending Point:\n");
    scanf("%d",&iValue2);

    RangeEvenDisplay(iValue1, iValue2);
    
    
    return 0;
}