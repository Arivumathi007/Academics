#include <iostream>
#include <cmath>

using namespace std;
class Vector{
    private:
    double x;
    double y;
    
    public:
    Vector(double x=0, double y=0) : x(x),y(y) {}
    double dotProduct(const Vector& other) const {
        return x * other.x + y*other.y;
    }
    
    double crossProduct(const Vector& other) const {
        return x * other.y - y*other.x;

    }
    
    double magnitude() const {
        return sqrt(x * x + y * y);
    }
    void print() const {
        cout << "(" << x << "," << y << ")" << "\n";
    }
};

int main() {
    Vector v1(3.0, 4.0);
    Vector v2(1.0, 2.0);

    double dot = v1.dotProduct(v2);
   cout << "Dot product of v1 and v2: " << dot << "\n";

    double cross = v1.crossProduct(v2);
    cout << "Cross product of v1 and v2: " << cross << "\n";

    double mag = v1.magnitude();
    cout << "Magnitude of v1: " << mag << "\n";

    return 0;
}

