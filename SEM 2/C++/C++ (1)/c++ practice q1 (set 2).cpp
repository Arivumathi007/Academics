#include <iostream>
using namespace std;

class Time {
private:
    int hours;
    int minutes;

public:
    Time(int h, int m){
        hours = h;
        minutes = m;
}

    bool operator==(const Time& other) const {
        return (hours == other.hours && minutes == other.minutes);
    }
};

int main() {
    Time time1(10, 30);
    Time time2(20, 40);

    if (time1 == time2) {
        cout << "The two times are equal." << "\n";
    } else {
        cout << "The two times are not equal." << "\n";
    }

    return 0;
}
