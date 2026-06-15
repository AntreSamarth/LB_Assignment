#include<stdio.h>

void Display(int iNo)
{
    char *Arr[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    if(iNo>=0 && iNo<=9)
    {
        printf("%s",Arr[iNo]);
    }
    else
    {
        printf("Invalid Input");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number:\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}