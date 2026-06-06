#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength, int No)
{
    int iCnt = 0;
    int iFreq = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == No)
        {
            iFreq++;
        }
    }

    return iFreq;
}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
    int iNo = 0;
    int *p = NULL;

    printf("Enter number of elements:\n");
    scanf("%d", &iSize);

    printf("Enter the No:\n");
    scanf("%d", &iNo);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter %d elements:\n", iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    iRet = Frequency(p, iSize, iNo);

    printf("Frequency of %d is : %d\n", iNo, iRet);

    free(p);

    return 0;
}