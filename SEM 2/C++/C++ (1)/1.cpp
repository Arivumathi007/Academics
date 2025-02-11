#include <iostream>  
using namespace std;  

int main() {  
    int num;  
    cout << "Enter the size of the array: ";  
    cin >> num;  

    int *arr = new int[num];  
    
    for (int i = 0; i < num; i++) {  
        arr[i] = i + 1;  
    }  
    
    cout << "Array elements: ";  
    for (int i = 0; i < num; i++) {  
        cout << arr[i] << " ";  
    }  
    cout << "\n";  

    int elem;  
    cout << "Enter number to delete from array: ";  
    cin >> elem;  

    int i;  
    for (i = 0; i < num; i++) {  
        if (arr[i] == elem) {  
            break; 
        }  
    }  

    if (i < num) {  
        for (int j = i; j < num - 1; j++) {  
            arr[j] = arr[j + 1];  
        }  
        num--;  
    } else {  
        cout << "Element not found in the array." << endl;  
    }  

    cout << "Updated array: ";  
    for (int i = 0; i < num; i++) {  
        cout << arr[i] << " ";  
    }  
    cout << endl;  

    delete[] arr;  

    return 0;  
}