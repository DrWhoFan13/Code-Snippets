#include <iostream>
int main() {
    
const int array = 5;
double numbers[array];
double sum_array = 0;
double third_of_array = 0;
double numdivbythree = 0;
double numindivbythree = 0;
double all;
double thirdarray;

 for (int i = 0; i < array; i++)
  {
    std::cout << "Enter a new number: ";
    std::cin >> numbers[i];
    sum_array += numbers[i];
    if (array%3) {
    numdivbythree++;
    continue;
}
else{
numindivbythree++;
continue;
}
  }
 
double avg_array = sum_array/array;
int count = 0;
std::cout << "The sum is " << sum_array << std::endl;
std::cout << "The average is " << avg_array << std::endl;
std::cout<< numdivbythree << " number(s) are dividable by three" << std::endl;
std::cout<< numindivbythree << " number(s) aren't dividable by three"<< std::endl;

return 0;
}