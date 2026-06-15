#include<stdio.h>

int DollarToINR(int iNo)
{
    int iRupees = 0;

    iRupees = 95 * iNo;

    return iRupees;

    
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter Amount:\n");
    scanf("%d",&iValue);
    
    DollarToINR(iValue);

    printf("VAlue in INR is: %d", iRet)
    
    return 0;
}