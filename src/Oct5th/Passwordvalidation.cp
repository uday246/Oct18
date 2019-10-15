
#include <iostream>
using namespace std;

bool validatePassword(string str){
    
    bool uF,lF,dF,sF;
    string sp="!@#$%&*;:";
    if(str.length()<8){
        cout<<"Password length should be atleast 8 chars";
        return false;
    }
    for(int i=0;i<str.length();i++){
        if(str[i]>='A' && str[i]<='Z')
            uF=true;
        if(str[i]>='a' && str[i]<='z')
            lF=true;
        if(str[i]>='0' && str[i]<='9')
            dF=true;
            
        if(sp.find(str[i])!=-1)
            sF=true;
    }
    cout<<str<<" : ";
    if(!uF){
      cout<<"Password should contain atleast 1 upper case letter";
      return false;
    }
    if(!lF){
      cout<<"Password should contain atleast 1 lower case letter";
      return false;
    }
    if(!dF){
      cout<<"Password should contain atleast 1 digit";
      return false;
    }
    if(!sF){
      cout<<"Password should contain atleast 1 special character";
      return false;
    }
    cout<<"valid password";
    return true;
}

int main()
{
  string str[]={"Uday@246","Koti@245","Hello123","Hello#"};
  for(int i=0;i<4;i++){
    validatePassword(str[i]);
    cout<<endl;
  }
    return 0;
}
