#include <iostream>
void reverse(const int array1[], int array2[], int size) {
for (int i = 0, j = size - 1; i < size; i++, j--) {
array2[j] = array1[i]; }
}
void printArray(const int array1[], int size) {
for (int i = 0; i < size; i++) std::cout << array1[i] << " ";
}
int main() {
const int SIZE = 5;
int array1[] = {1, 2, 3, 4, 5}; int array2[SIZE];
reverse(array1, array2, SIZE);
std::cout << "Array 1 is: "; printArray(array1, SIZE); std::cout << std::endl;
std::cout << "Array 2 is: "; printArray(array2, SIZE); std::cout << std::endl;
return 0; }
 