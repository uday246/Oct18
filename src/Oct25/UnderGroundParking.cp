#include <iostream>
using namespace std;
void getCustomerNameAndHoursParked(string &s,double &d){
cout<<"Enter customer name : ";
cin>>s;
cout<<"Enter hours parked : ";
cin>>d;
}
double calcCharge(double d){
double total=4;
if(d>=24)
return 14;
if(d<=2)
return 4;
d=d-2;
total=total+d*0.75;
return total;
}
int main()
{
string name1,name2,name3;
double hours1,hours2,hours3;
double price1,price2,price3;
getCustomerNameAndHoursParked(name1,hours1);
getCustomerNameAndHoursParked(name2,hours2);
getCustomerNameAndHoursParked(name3,hours3);
price1 = calcCharge(hours1);
price2 = calcCharge(hours2);
price3 = calcCharge(hours3);
cout<<"Customer\tHours\tPrice\n";
cout<<name1<<"\t\t"<<hours1<<"\t"<<price1<<endl;
cout<<name2<<"\t\t"<<hours2<<"\t"<<price2<<endl;
cout<<name3<<"\t\t"<<hours3<<"\t"<<price3<<endl;
  
  
  
}