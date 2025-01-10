#include <iostream>
int max_array(int array[], int size) { int max_array = array[0];
for (int i = 1; i < size; i++) {
if (array[i] > max_array) { max_array = array[i];
} }
return max_array; }
int main() {
int my_array[5] = {1,2,3,4,5};
int max_val = max_array(my_array, 5);
std::cout << "The maximum value of the array is: " << max_val << std::endl;
return 0; }