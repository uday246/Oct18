#include <iostream>

using namespace std;

void fillGrid(char arr[][6],int r,int c){
    char ch='A';
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(i==4 &&j==2)
            ch='0';
            arr[i][j]=ch;
            ch++;
        }
    }
}
int main()
{
    int rows=6,cols=6;
    char grid[6][6];
    fillGrid(grid,rows,cols);
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            cout<<grid[i][j]<<" ";       
        }
        cout<<endl;
    }
    return 0;
}