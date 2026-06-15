#include<stdio.h>

float FhtoCs(float Temp)
{
    float fcelcius = 0.0;

    fcelcius = (Temp -32)* 5/9;

    return fcelcius;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter Temperature in FArenheit:\n");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);
    
    printf("The Temperature is:%f",dRet);
    
    return 0;
}