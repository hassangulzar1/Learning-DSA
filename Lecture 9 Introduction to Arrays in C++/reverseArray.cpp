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

  //   for (int i = 0, j = 6; i < 6 && j > 0; i++, j--) {
  //     if (i > j) {
  //       break;
  //     }
  //
  //     int start = arr[i];
  //     int end = arr[j];
  //     arr[i] = end;
  //     arr[j] = start;
  //   }

  for (int i = 0; i < 5; i++) {
    /* code */
    cout << arr[i] << endl;
  }
}