#include <iostream>
#include <math.h>
using namespace std;
int prod(int a,int b){
    return a*b;
}
int max(int a,int b,int c){
    if(a>=b && a>=c)
        return a;
    else if(b>=c && b>=a)
        return b;
    return c;
}
double power(int n,int p){
    return pow(n,p);
}
double roundUp(double d){
    return ceil(d);
}
double roundDown(double d){
    return floor(d);
}
char toUpper(char c){
    if(c>='a' && c<='z')
        return c-32;
return c;
}
int main(){
   cout<<prod(4,5)<<endl;
   cout<<max(10,4,5)<<endl;
   cout<<power(2,3)<<endl;
   cout<<roundDown(2.3)<<endl; 
   cout<<roundUp(2.3)<<endl; 
   cout<<toUpper('c')<<endl; 
   
}