#include <iostream>
using namespace std;

int main() {
  int arr[6] = {1, 2, 7, 8, 5, 6};

  int nextVal = 1;
  while (nextVal < 6) {
    swap(arr[nextVal - 1], arr[nextVal]);
    nextVal += 2;
  }

  for (int i = 0; i < 6; i++) {
    cout << arr[i] << " ";
  }
}
