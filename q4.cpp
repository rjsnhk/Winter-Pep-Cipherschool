// Write a C++ program that demonstrates the concept of dynamic arrays using std::vector. The program should:

// Prompt the user to enter the number of elements they want to store in a dynamic array (vector).
// Use a std::vector to store the elements entered by the user.
// Allow the user to input the elements of the vector.
// Display the elements of the vector.
// Include functionality to add a new element to the vector and display the updated vector."


#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> dynamicArray;

    int numElements;

    cout << "Enter the number of elements you want to store in the vector: ";
    cin >> numElements;

    cout << "Enter " << numElements << " elements: " << endl;
    for (int i = 0; i < numElements; ++i) {
        int element;
        cin >> element;
        dynamicArray.push_back(element);
    }

    cout << "The elements in the vector are: ";
    for (int elem : dynamicArray) {
        cout << elem << " ";
    }
    cout << endl;

    cout << "Enter an element to add to the vector: ";
    int newElement;
    cin >> newElement;
    dynamicArray.push_back(newElement);

    cout << "The updated vector is: ";
    for (int elem : dynamicArray) {
        cout << elem << " ";
    }
    cout << endl;

    return 0;
}
