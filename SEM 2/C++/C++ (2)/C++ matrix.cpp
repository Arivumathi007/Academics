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
   Matrix operator*(const Matrix &other){
       if(columns != other.rows){
   }
   Matrix result(rows, other.columns);
   for(int i=0;i<rows;i++){
       for(int j=0;j<other.columns;j++){
           result.data[i][j] = 0;
           for(int k=0;k<columns;k++){
               result.data[i][j] += data[i][k]*other.data[k][j];
           }
       }
   }
          return result;
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
    Matrix m1 (3,2);
    Matrix m2 (2,3);
    
    m1.setValue(0,0,3);
    m1.setValue(0,1,2);
    m1.setValue(1,0,4);
    m1.setValue(1,1,6);
    m1.setValue(2,0,1);
    m1.setValue(2,1,3);
    
    m1.displayMatrix();
    cout<<"\n";
    
    m2.setValue(0,0,2);
    m2.setValue(0,1,4);
    m2.setValue(0,2,3);
    m2.setValue(1,0,1);
    m2.setValue(1,1,5);
    m2.setValue(1,2,3);
    
    m2.displayMatrix();
    cout<<"\n";
    
    Matrix m3 = m1 * m2;
    
    m3.displayMatrix();
    cout<<"\n";

    cout << "Matrix has been multiplied";

    return 0;
}