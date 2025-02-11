#include <iostream>
#include <vector>
#include <algorithm>  // For sorting

using namespace std;

vector<int> findElementsWithAtLeastTwoGreater(const vector<int>& arr) {
    vector<int> result;
    if (arr.size() < 3) return result;  // No element can have 2 greater if there are less than 3 elements

    // Sort the array to make comparisons easier
    vector<int> sortedArr = arr;
    sort(sortedArr.begin(), sortedArr.end());

    int secondLargest = sortedArr[sortedArr.size() - 3];  // Element that has at least two greater ones

    // Add elements that are less than or equal to the second largest
    for (int num : arr) {
        if (num <= secondLargest) {
            result.push_back(num);
        }
    }

    return result;
}

int main() {
    vector<int> arr;
    int n;

    cout << "Enter the number of elements: ";
    cin >> n;

    cout << "Enter the elements: ";
    for (int i = 0; i < n; ++i) {
        int value;
        cin >> value;
        arr.push_back(value);
    }

    vector<int> elements = findElementsWithAtLeastTwoGreater(arr);

    cout << "Elements that have at least two greater elements: ";
    for (int num : elements) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
