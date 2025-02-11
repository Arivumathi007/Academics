#include <iostream>  

int main() {  
    int n;  
    std::cout << "Enter the value of n: ";  
    std::cin >> n;  // Input the number of terms  

    int sum = 0; // Variable to store the sum  

    // Loop to calculate the sum of the series (1*1) + (2*2) + ... + (n*n)  
    for (int i = 1; i <= n; ++i) {  
        sum += i * i; // Adding i squared to sum  
    }  

    std::cout << "The sum of the series (1*1) + (2*2) + ... + (" << n << "*" << n << ") is: " << sum << std::endl;  

    return 0;  
}