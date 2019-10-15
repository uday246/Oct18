#include <iostream>

using namespace std;
void printPryamid(int rows){
    int count=0;
    for(int i = 1, k = 0; i <= rows; ++i, k = 0)
    {
        for(int space = 1; space <= rows-i; ++space)
        {
            cout <<"  ";
        }

        while(k != 2*i-1)
        {
            cout << "* ";
            ++k;
            count++;
        }
        cout << endl;
    }    
    cout<<"\n\nHeight of the pryamid : "<<rows<<endl;
    cout<<"umber of symbols used : "<<count<<endl;
    
}
int main()
{
    printPryamid(3);
    printPryamid(6);
    
    return 0;
}
