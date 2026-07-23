#include<iostream>
using namespace std;

template<class T>
T Max(T *Arr, int iSize)
{
    T Max = Arr[0];
    int i = 0;

    for(i = 1; i < iSize; i++)
    {
        if(Arr[i] > Max)
        {
            Max = Arr[i];
        }
    }

    return Max;
}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0f,3.7f,9.8f,8.7f};

    int iRet = Max(Arr,5);
    cout<<"Largest element is : "<<iRet<<"\n";

    float fRet = Max(Brr,4);
    cout<<"Largest element is : "<<fRet<<"\n";

    return 0;
}