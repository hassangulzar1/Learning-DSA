#include <iostream>
using namespace std;

void printArr(int arr[], int n) {
  for (int i = 0; i < n; i++) {
    cout << arr[i] << ' ';
  }
  cout << endl;
}

void zerOne2(int arr[], int n) {}
int main() {
  int arr[6] = {0, 1, 2, 2, 1, 0};
  zerOne2(arr, 6);
  printArr(arr, 6);

  return 0;
}