#include<iostream>
using namespace std;

template<class T>
T Max(T No1, T No2, T No3)
{
    if((No1 >= No2) && (No1 >= No3))
    {
        return No1;
    }
    else if((No2 >= No1) && (No2 >= No3))
    {
        return No2;
    }
    else
    {
        return No3;
    }
}

int main()
{
    int iRet = Max(10,20,30);
    cout<<"Largest number is : "<<iRet<<"\n";

    float fRet = Max(10.5f,20.7f,15.6f);
    cout<<"Largest number is : "<<fRet<<"\n";

    return 0;
}