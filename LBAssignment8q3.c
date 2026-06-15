#include<stdio.h>

int KMtoMeter(int iNo)
{
    int iDistance = 0;

    iDistance = 1000 * iNo;

    return iDistance;
}


int main()
{
    int iValue = 0; 
    int iRet = 0;

    printf("Enter Distance:\n");
    scanf("%d",&iValue);
    
    iRet = KMtoMeter(iValue);
    
    printf("The Distance is :%d",iRet);
    
    
    return 0;
}