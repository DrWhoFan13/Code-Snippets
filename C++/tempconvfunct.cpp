#include <iostream> using namespace std;
double fahrenheitToCelsius(double fahrenheit);
int main() {
double fahrenheitTemperatures[4] = {50, 60, 70, 100}; double celsiusTemperatures[4];
for (int i = 0; i < 4; i++) {
celsiusTemperatures[i] = fahrenheitToCelsius(fahrenheitTemperatures[i]); cout << fahrenheitTemperatures[i] << " degrees Fahrenheit is " <<
celsiusTemperatures[i] << " degrees Celsius." << endl; }
return 0; }
double fahrenheitToCelsius(double fahrenheit) { return (fahrenheit - 32) * 5 / 9;
}