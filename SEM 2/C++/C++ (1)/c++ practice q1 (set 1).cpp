// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
class Matrix{
    private:
    int rows;
    int columns;
    int **data;
    
    public:
    
    Matrix(int r,int c){
        rows=r;
        columns=c;
        data=new int*[rows];
           for(int i=0;i<rows;i++){
               data[i]=new int[columns];
           for(int j=0;j<columns;j++){
               data[i][j]=0;
           }
    }
}
    void setValue(int rownumber,int columnnumber,int value){
       if (rownumber < rows && columnnumber < columns){
           data[rownumber][columnnumber] = value;
       }
    }
    void displayMatrix(){
           for(int i=0;i<rows;i++){
              for(int j=0;j<columns;j++){
                  cout<<data[i][j]<<"\t";
              }
              cout<<"\n";
           }
       }
};
int main() {
    Matrix m1 (3,3);
    m1.setValue(0,0,3);
    m1.setValue(0,1,2);
    m1.setValue(0,2,3);
    m1.setValue(1,0,2);
    m1.setValue(1,1,4);
    m1.setValue(1,2,6);
    m1.setValue(2,0,1);
    m1.setValue(2,1,3);
    m1.setValue(2,2,4);
    
    m1.displayMatrix();
    cout << "\n";
    cout << "The matrix has been printed";

    return 0;
}