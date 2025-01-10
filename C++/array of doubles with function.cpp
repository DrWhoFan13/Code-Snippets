#include <iostream> using namespace std;
void twice(const int list[], int newList[], int size) {
for (int i = 0, j = size - 1; i < size; i++, j--) {
newList[j] = 2 * list[i]; }
}
void printArray(const int list[], int size) {
for (int i = 0; i < size; i++) cout << list[i] << " ";
}
int main() {
const int SIZE = 10;
int list[] = {-1,2,-3,4,5,6,7,-8,-9,-10}; int newList1[SIZE];
twice(list, newList1, SIZE);
cout << "The original array: "; printArray(list, SIZE);
cout << endl;
cout << "The doubled array: "; printArray(newList1, SIZE); cout << endl;
return 0; }
 