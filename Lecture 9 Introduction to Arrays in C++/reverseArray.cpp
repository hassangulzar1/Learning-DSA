#include <iostream>
using namespace std;

int main() {
  int arr[5] = {1, 2, 3, 4, 5};

  int start = 0;
  int end = 4;
  while (start <= end) {
    swap(arr[start], arr[end]);
    // int startVal = arr[start];
    // arr[start] = arr[end];
    // arr[end] = startVal;
    start++;
    end--;
  }

  for (int i = 0; i < 5; i++) {
    cout << arr[i] << endl;
  }
}