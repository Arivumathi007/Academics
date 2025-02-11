#include <iostream>
using namespace std;

class ComplexRational {
private:
    int numeratorReal;
    int numeratorImaginary;
    int denominatorReal;
    int denominatorImaginary;

public:
    // Default constructor
    ComplexRational() {
        numeratorReal = 0;
        numeratorImaginary = 0;
        denominatorReal = 1; // Set to 1 to avoid division by zero
        denominatorImaginary = 1;
    }

    // Parameterized constructor
    ComplexRational(int x, int y, int z, int r) {
        numeratorReal = x;
        numeratorImaginary = y;
        denominatorReal = z;
        denominatorImaginary = r;
    }

    // Operator overloading for +
    ComplexRational operator+(ComplexRational const &other) {
        int realNumerator = (numeratorReal * other.denominatorReal) + (other.numeratorReal * denominatorReal);
        int realDenominator = denominatorReal * other.denominatorReal;
        int imagNumerator = (numeratorImaginary * other.denominatorImaginary) + (other.numeratorImaginary * denominatorImaginary);
        int imagDenominator = denominatorImaginary * other.denominatorImaginary;

        return ComplexRational(realNumerator, imagNumerator, realDenominator, imagDenominator);
    }

    // Operator overloading for -
    ComplexRational operator-(ComplexRational const &other) {
        int realNumerator = (numeratorReal * other.denominatorReal) - (other.numeratorReal * denominatorReal);
        int realDenominator = denominatorReal * other.denominatorReal;
        int imagNumerator = (numeratorImaginary * other.denominatorImaginary) - (other.numeratorImaginary * denominatorImaginary);
        int imagDenominator = denominatorImaginary * other.denominatorImaginary;

        return ComplexRational(realNumerator, imagNumerator, realDenominator, imagDenominator);
    }

    // Operator overloading for *
    ComplexRational operator*(ComplexRational const &other) {
        int realNumerator = numeratorReal * other.numeratorReal;
        int realDenominator = denominatorReal * other.denominatorReal;
        int imagNumerator = numeratorImaginary * other.numeratorImaginary;
        int imagDenominator = denominatorImaginary * other.denominatorImaginary;

        return ComplexRational(realNumerator, imagNumerator, realDenominator, imagDenominator);
    }

    // Friend function to overload the << operator for output
    friend ostream& operator<<(ostream& os, const ComplexRational& cr) {
        os << "(" << cr.numeratorReal << "/" << cr.denominatorReal << ") + "
           << "(" << cr.numeratorImaginary << "/" << cr.denominatorImaginary << ")i";
        return os;
    }
};

int main() {
    ComplexRational b1(2, 3, 4, 5);
    int a, b, c, d;
    
    cout << "Enter numeratorReal: ";
    cin >> a;
    cout << "Enter numeratorImaginary: ";
    cin >> b;
    cout << "Enter denominatorReal: ";
    cin >> c;
    cout << "Enter denominatorImaginary: ";
    cin >> d;

    ComplexRational b2(a, b, c, d);
    ComplexRational b3;
    int choice;

    cout << "Enter choice (1 for addition, 2 for subtraction, 3 for multiplication, 4 for display): ";
    cin >> choice;

    switch (choice) {
        case 1:
            b3 = b1 + b2;
            cout << "The complex number after addition is: " << b3 << endl;
            break;
        case 2:
            b3 = b1 - b2;
            cout << "The complex number after subtraction is: " << b3 << endl;
            break;
        case 3:
            b3 = b1 * b2;
            cout << "The complex number after multiplication is: " << b3 << endl;
            break;
        case 4:
            cout << "The first complex number is: " << b1 << endl;
            cout << "The second complex number is: " << b2 << endl;
            break;
        default:
            cout << "Enter a proper choice (1-4)" << endl;
            break;
    }

    return 0;
}
