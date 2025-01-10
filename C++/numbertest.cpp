#include <iostream>
using namespace std;
int main()
{
double number;
double x;
double y;
cout<<("Please enter your number: ");
cin>>(number);
x=number*number;
y=x*number;
cout<<"The square of your number is " << x << endl;
cout<<"The cube of your number is " << y << endl;
return 0;
}