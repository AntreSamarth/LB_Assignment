#include<stdio.h>

double SquareMeter(int iNo)
{
    double Area = 0.0;

    Area = iNo * 0.0929;

    return Area;
}


int main()
{
    int iValue = 0;
    double dRet =0.0;

    printf("Enter area in sqaure feet:\n");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("The Area in sq meter is:%lf",dRet);

    return 0;
}