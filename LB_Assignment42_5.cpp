#include<iostream>
using namespace std;

template<class T>
T Min(T *Arr, int iSize)
{
    T Min = Arr[0];
    int i = 0;

    for(i = 1; i < iSize; i++)
    {
        if(Arr[i] < Min)
        {
            Min = Arr[i];
        }
    }

    return Min;
}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0f,3.7f,9.8f,8.7f};

    int iRet = Min(Arr,5);
    cout<<"Smallest element is : "<<iRet<<"\n";

    float fRet = Min(Brr,4);
    cout<<"Smallest element is : "<<fRet<<"\n";

    return 0;
}