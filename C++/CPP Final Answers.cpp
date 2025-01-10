Problem #1
Answer:
#include <iostream>
class Students { private:
int id;
double grade; //Properties of each student in the system
public:
Students() : id(0), grade(0) {}
void setId(int studentid) { id = studentid;
}
void setGrade(double studentgrade) { grade = studentgrade;
}
int getID() const { return id;
}
double getGrade() const { return grade;
}
}; // constructors of each student
int main() {
const int numStudents = 5; Students students[numStudents];
double sumGrades = 0;
int totalStudents = 0; // Used to hold the average grade and the total student amount
for (int i = 0; i < numStudents; i++) { int id;
double grade;
std::cout << "Please input a student's ID #: "; std::cin >> id;
std::cout << "Now input their grade: ";
std::cin >> grade; // code responsible for inputs
students[i].setId(id);

students[i].setGrade(grade);
sumGrades += grade;
totalStudents++; //Code responsible for keeping track of each student's grade and how many there are
std::cout << "Student ID #" << students[i].getID() << " has a grade of " << students[i].getGrade() << "%" << '\n'; //The code stating the grade of Student ID #
}
double averageGrade = sumGrades / totalStudents;
std::cout << "The average grades of all the students is: " << averageGrade << "%" << endl; //The code stating the average grade of all the students
return 0; }
 
Problem #2
#include <iostream>
int arrayIndex(const int myList[], int size, int number){ for (int i = 0; i < size; i++){
if (myList[i] == number){ return i;
} }
return -1;
} //The function required for the search
int main() {
const int size = 7;
int myList[]={1, -9, 10, 20, 5, 6, 7}; //The array for the parameters int number;
std::cout<<"Please input the number you want to find: "; std::cin>> number;//Input for the search
int location = arrayIndex(myList, size, number); if (location != -1) {
std::cout << number << " is in spot #" << location << " of the array" << std::endl; } else {
std::cout << number << " isn't in the array." << std::endl;
} // Determines the output. If in the array, states which spot it occupies. If not, then it states that it isn't
return 0; }
 
Problem #3
Answer:
#include <iostream>
class CRoomArea {
private:
int length; int width;
public: CRoomArea(int, int); int areaofroom()
{
return (length * width); }
int getLength() {
return length; }
int getWidth() {
return width; }
}; // defines length, width, and area CRoomArea::CRoomArea(int x, int y)

{
length = x; width = y;
} //stores length and width
int main() {
CRoomArea room1(15, 8);
int area1 = room1.areaofroom();
std::cout << "The area of the bedroom is: " << area1 << std::endl;
CRoomArea room2(10, 7);
int area2 = room2.areaofroom();
std::cout << "The area of the bathroom is: " << area2 << std::endl;
CRoomArea room3(15, 10);
int area3 = room3.areaofroom();//code determining calculations of an area std::cout << "The area of the kitchen is: " << area3 << std::endl;
if (area1 > area2 && area1 > area3) {
std::cout << "The bedroom is the largest room." << std::endl; }
else if (area2 > area1 && area2 > area3) {
std::cout << "The bathroom is the largest room." << std::endl; }
else (area3 > area1 && area3 > area2); {
std::cout << "The kitchen is the largest room." << std::endl;

} //if-else if statement determining which room's the largest
return 0; }
 