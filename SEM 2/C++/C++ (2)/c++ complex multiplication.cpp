#include <iostream>
using namespace std;
class Complex{
    private:
    int real;
    int img;
    
    public:
    Complex(int r, int i){
        real=r;
        img=i;
    }
    Complex operator*(Complex const &other){
        int realPart = real * other.real - img * other.img;
        int imgPart = real * other.img + img * other.real;
        return Complex(realPart,imgPart);
    }
    void print(){
        cout<<real<<"+i"<<img<<"\n";
    }
};
int main() {
    Complex c1(4,5);
    Complex c2(3,4);
    
    c1.print();
    c2.print();
    Complex c3=c1*c2;
    c3.print();

    return 0;
}