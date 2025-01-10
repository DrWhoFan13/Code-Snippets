/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <cmath>

using namespace std;

double power (int x, int y)
{
  int temp;
  temp = pow (x, y);
  return temp;
}

int main ()
{
  int a, b;
  cout << "power code:\n\n";

  cin >> a;
  cin >> b;

  cout << "The total of "<< a << " to the power of " << b << " is " << power (a, b);
  return 0;
}
