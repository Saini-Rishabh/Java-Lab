#include<iostream>
using namespace std;

int main()
{
        int n,k;
        cin>>n>>k;
        int a[n];
        for(int i=0;i<n;i++)
            cin>>a[i];
        int res=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
            if(abs(a[j]-a[i])<k)
            res++;
        cout<<res;
}
