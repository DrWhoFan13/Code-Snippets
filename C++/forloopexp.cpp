#include <iostream>
int main() {
int i;
int count =0;
int sum = 0;
int number;
std::cout<<"Please input your numbers:\n";
for(i=0;i<10;i++) {
std::cin>> number;
sum += number;
if (number <0){
count++;
}
}
double avg = sum/10.0;
std::cout<< "The sum is: " << sum << std::endl;
std::cout<< "The average is: " << avg << std::endl;
}