#include <iostream>
class Circle
{
private:
    double radius;
public:
    Circle()
    {
        radius = 1;
    }
    Circle(double newRadius)
    {
        radius = newRadius;
    }
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return radius * radius * 3.14159;
    }
    // Return the perimeter of this circle
    double getPermeter()
    {
        return 2 * radius * 3.14159;
    }
    // Set new radius for this circle
    void setRadius(double newRadius)
    {
        radius = newRadius;
    }
}; 

int main()
{
    Circle circle1(10);
    Circle circle2(20);
    Circle circle3;
    
    std::cout << "The area of the circle with radius " << circle1.getRadius() << " is " << circle1.getArea() << std::endl;
    std::cout << "The area of the circle with radius " << circle2.getRadius() << " is " << circle2.getArea() << std::endl;
    std::cout << "The area of the circle with radius " << circle3.getRadius() << " is " << circle3.getArea() << std::endl;

    circle2.setRadius(20);
    std::cout << "The radius of the circle with radius " << circle2.getRadius() << " is " << circle2.getRadius()<< std::endl;

    circle3.setRadius(40);
    std::cout << "The radius of the circle with radius " << circle3.getRadius() << " is " << circle3.getRadius()<< std::endl;

    return 0;
}