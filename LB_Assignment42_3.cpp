#include<iostream>
using namespace std;

template<class T>
T AddN(T *Arr, int iSize)
{
    T iSum = 0;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        iSum = iSum + Arr[i];
    }

    return iSum;
}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0f,3.7f,9.8f,8.7f};

    int iSum = AddN(Arr,5);
    cout<<"Addition is : "<<iSum<<"\n";

    float fSum = AddN(Brr,4);
    cout<<"Addition is : "<<fSum<<"\n";

    return 0;
}