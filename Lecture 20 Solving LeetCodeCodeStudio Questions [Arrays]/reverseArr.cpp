#include <iostream>
#include <vector>
using namespace std;

int main() {
  vector<int> arr = {1, 2, 3, 4, 5, 6};
  int m = 3;

  int s = m + 1;
  int e = arr.size() - 1;
  while (s <= e) {
    swap(arr[s], arr[e]);
    s++;
    e--;
  }

  for (int i = 0; i < arr.size(); i++) {
    cout << arr[i];
  }

  return 0;
}