/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <cmath>

using namespace std;

double
power (int x, int y)
{
  int temp;
  temp = pow (x, y);
  return temp;
}

int
main ()
{
  int a = 1, b = 1 ;
  cout << "power code:\n\n";
  
while(a != 0 && b != 0){
  cin >> a;
  cin >> b;

  cout << power (a, b) << "\n\n";
}
  return 0;
}
