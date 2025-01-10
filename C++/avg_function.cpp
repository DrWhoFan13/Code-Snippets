#include <iostream>
using namespace std;

int main() {
int number1;
int number2;
int number3;
int number4;

std::cout << "Input a number: ";
std::cin >> number1;
std::cout << "Input a number: ";
std::cin >> number2;
std::cout << "Input a number: ";
std::cin >> number3;
std::cout << "Input a number: ";
std::cin >> number4;
double result = (number1 + number2 + number3 + number4)/ 4.0;

std::cout<<"The average is " << result;
    return 0;
}

int avg(int number1, int number2, int number3, int number4){
double result = (number1 + number2 + number3 + number4)/ 4.0;
return result;
}