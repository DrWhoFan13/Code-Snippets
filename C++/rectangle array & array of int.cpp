#include <iostream> #include <iomanip> using namespace std;
class Rectangle {
private:
double length; double width;
public: Rectangle() {
length = 2;
width = 1; }
Rectangle(double newLength, double newWidth) {
length = newLength;
width = newWidth; }
double getArea() {
return length * width; }
double getLength() {
return length; }
double getWidth() {
return width; }
void setLength(double newLength) {
length = newLength; }
void setWidth(double newWidth) {
width = newWidth; }
};

double sum(Rectangle rectangleArray[], int size) {
double sum = 0;
for (int i = 0; i < size; i++)
sum += rectangleArray[i].getArea();
return sum; }
void printRectangleArray(Rectangle rectangleArray[], int size) {
cout << setw(10) << left << "Length" << setw(8) << "Width" << setw(8) << "Area" << endl; for (int i = 0; i < size; i++)
{
cout << setw(10) << left << rectangleArray[i].getLength() << setw(8) << rectangleArray[i].getWidth()
<< setw(8) << rectangleArray[i].getArea() << endl; }
cout << " " << endl;
cout << setw(35) << left << "The total area of the rectangles is: " << setw(8) << sum(rectangleArray, size) << endl;
}
int main() {
const int SIZE = 10;
int array_rect_dimension[SIZE] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
Rectangle rectangleArray[5];
for (int i = 0; i < 5; i++) {
double length = array_rect_dimension[i * 2]; double width = array_rect_dimension[i * 2 + 1];
rectangleArray[i].setLength(length);
rectangleArray[i].setWidth(width); }
printRectangleArray(rectangleArray, 5);
return 0; }

 