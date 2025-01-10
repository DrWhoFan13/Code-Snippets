// C++ program to create calculator using
// switch statement
#include <iostream>
#include <cmath>
using namespace std;
 
// Main program
int main()
{
    char op;
    float num1, num2, result;
 
    // It allows user to enter operator i.e. +, -, *, /
    cout<<"enter one of the characters +, -, *, /, ^:";
    cin >> op;
 
    // It allow user to enter the operands
    cout<< "enter two numbers:"<<endl;
    cin >> num1 >> num2;
 
    // Switch statement begins
    switch (op) {
         
        // If user enter +
        case '+':
            cout << num1 + num2;
            break;
         
        // If user enter 
        case '-':
            cout << num1 - num2;
            break;
         
        // If user enter *
        case '*':
            cout << num1 * num2;
            break;
         
        // If user enter /
        case '/':
            cout << num1 / num2;
            break;
              
        case '^':
            result = pow(num1, num2);
            cout << num1 << "^" << num2 << " = " << result;
            break;
            
        // If the operator is other than +, -, * or /,
        // error message will display
        default:
            cout << "Error! operator is not correct";
            break;
    } // switch statement ends
 
    return 0;
}