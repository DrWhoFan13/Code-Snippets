#include <iostream> class CRectArea
{
private:
int length; int breadth;
public:
CRectArea (int,int);
int areaofrect() {
return (length * breadth); }
int length1() {
return length; }
int breadth1() {
return breadth; }
};
CRectArea::CRectArea(int x, int y) {
length = x;
breadth = y; }
int main() {
CRectArea rect1(2, 5);
int area1 = rect1.areaofrect();
std::cout << "The area of the first rectangle is: " << area1 << std::endl;
CRectArea rect2(6, 9);
int area2 = rect2.areaofrect();
std::cout << "The area of the second rectangle is: " << area2 << std::endl; std::cout << "The sum of the two rectangles is: " << area1 + area2;
}
 