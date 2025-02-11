#include <iostream>
using namespace std;
int main() {
    int* at;
    int a,min,l;
    cout << "Enter the number of elements in array: ";
    cin >> a;
    at = (int*)malloc(a*sizeof(int));
    
    for(int i = 0; i < a-1; i++){
        min = i;
        for(int j = i + 1; j < a; j++){
        if(at[j] < at[min]){
            min = j;
        }
    }
    
    l = at[i];
    at[i] = at[min];
    at[min] = l;
    }
    cout << "Elements after sorting" << "\n";
    for(int i=0; i < a; i++){
        cout << at[i] << "\n";
    }
    return 0;
}