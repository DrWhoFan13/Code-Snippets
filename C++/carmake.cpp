#include <iostream>
using namespace std;
int main()
{
 double year;
 double weight;
 cout << "Input the year of the car";
 cin  >> (year);
 cout << "Input the weight of the car";
 cin >> (weight);
 if (/* year < 2005 & weight > 3000 */)
 {
    cout << "The DMV Record is 1";  
 }
 else if (/* year < 2005 & weight < 3000 */)
  {
    cout << "The DMV Record is 2"; 
  }
  else (/* year > 2005 & weight > 3000 */)
  {
    cout << "The DMV Record is 3";
  }
  return 0;
}