#include <iostream>
using namespace std;
int main()
{
    double caryear;
    double carweight;
    cout << "Please input the car's year: ";
    cin >> caryear;
    cout << "Please input the car's weight: ";
    cin >> carweight;
    {
    if (caryear <= 1990 && carweight < 2700){
        cout << "The weight class is 1 and the registration fee is $26.50" << endl;
    }
    else if (caryear <= 1990 && carweight < 3800){
     cout << "The weight class is 2 and the registration fee is $35.50" << endl;
    }
    else if (caryear <= 1990 && carweight > 3800){ 
    cout << "The weight class is 3 and the registration fee is $56.50" << endl;
    }
    else if (caryear <= 1999 && carweight < 2700){
    cout << "The weight class is 4 and the registration fee is $35" << endl;
    }
    else if (caryear <= 1999 && carweight < 3800){ 
     cout << "The weight class is 5 and the registration fee is $45.50" << endl;
    }
    else if (caryear <= 1999 && carweight > 3800){ 
     cout << "The weight class is 6 and the registration fee is $62.50" << endl;
    }
    else if (caryear >= 2000 && carweight < 3500){
     cout << "The weight class is 7 and the registration fee is $49.50" << endl;
     }
    else{
     cout << "The weight class is 8 and the registration fee is $62.50" << endl;
    }
}
  return 0;
}