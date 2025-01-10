#include <iostream> #include <cmath> using namespace std;
class GeometricObject {
public:
GeometricObject();
GeometricObject(const string& color, bool filled); string getColor() const;
void setColor(const string& color);
bool isFilled() const;
void setFilled(bool filled);
string toString() const;
private: string color; bool filled;
};
GeometricObject::GeometricObject() {
color = "white";
filled = false; }
GeometricObject::GeometricObject(const string& color, bool filled) {
this->color = color;
this->filled = filled; }
string GeometricObject::getColor() const {
return color; }
void GeometricObject::setColor(const string& color) {
this->color = color; }
bool GeometricObject::isFilled() const {
return filled; }
void GeometricObject::setFilled(bool filled) {

this->filled = filled; }
string GeometricObject::toString() const {
return "Geometric Object"; }
class Circle : public GeometricObject {
private:
double radius, circumference;
public:
Circle(double radius, double circumference) {
this->radius = radius; }
double getArea() const {
return 3.14159 * radius * radius; }
double getPerimeter() const {
return 2 * 3.14159 * radius; }
};
int main() {
cout << "Enter the radius: "; double radius;
cin >> radius;
Circle circle(radius);
cout << "Enter the color: "; string color;
cin >> color;
cout << "Enter 1/0 for filled (1: true, 0: false): "; bool filled;
cin >> filled;
circle.setColor(color);

circle.setFilled(filled);
cout << "Area is " << circle.getArea() << endl;
cout << "Perimeter is " << circle.getPerimeter() << endl; cout << "Color is " << circle.getColor() << endl;
cout << "Filled is " <<
(circle.isFilled() ? "true" : "false") << endl;
return 0; }
 