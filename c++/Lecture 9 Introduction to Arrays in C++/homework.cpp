#include <iostream>
using namespace std;

//! Sum Of Array Elements
int sumOfArray(int arr[], int size) {
  int sum = 0;

  for (int i = 0; i < size; i++) {
    sum += arr[i];
  }

  return sum;
}
int main() {
  //! Sum of Array Elements
  int size;
  cin >> size;
  int arr[100];

  for (int i = 0; i < size; i++) {
    cin >> arr[i];
  }

  cout << "Sum of your given Elements is: " << sumOfArray(arr, size) << endl;
}