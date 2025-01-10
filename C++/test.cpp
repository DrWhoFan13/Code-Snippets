#include <iostream>
using namespace std;
int main()
{
double grade1;  // declare grade1 as a double variable
double grade2;  // declare grade2 as a double variable
double total;   // declare total as a double variable
double average; // declare average as a double variable
grade1 = 85.5;
grade2 = 97.0;
total = grade1 + grade2;
average = total / 2.0;  // divide the total by 2.0
cout << "The average grade is " << average << endl;
system("pause");
return 0;
}
