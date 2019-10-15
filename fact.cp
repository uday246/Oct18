#include <iostream>

using namespace std;
long fact(int n){
    if(n==1)
    return 1;
   return n*fact(n-1);
}
int main()
{
    for(int i=01;i<=5;i++)
    cout<<"Factorial of "<<i<<" : "<<fact(i)<<endl;
    
    return 0;
}
