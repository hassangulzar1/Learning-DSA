#include <algorithm>
#include <iostream>
using namespace std;

void printArr(int arr[], int n) {
  for (int i = 0; i < n; i++) {
    cout << arr[i] << " ";
  }
  cout << endl;
}

void zerOne2(int arr[], int n) {
  int l = 0;
  int r = n - 1;
  int m = 0;
  while (m <= r) {
    switch (arr[m]) {
      case 0:
        swap(arr[l++], arr[m++]);
        break;
      case 1:
        m++;
        break;
      case 2:
        swap(arr[m], arr[r--]);
    }
  }
}
int main() {
  int arr[6] = {2, 1, 2, 0, 1, 0};
  zerOne2(arr, 6);
  printArr(arr, 6);

  return 0;
}