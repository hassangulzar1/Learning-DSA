#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
  vector<int> arr = {1, 1, 2};
  vector<int> duplicateElements;

  sort(arr.begin(), arr.end());
  for (int i = 0; i < arr.size() - 1; i++) {
    if (arr[i] == arr[i + 1]) {
      duplicateElements.push_back(arr[i]);
    }
  }

  for (int i = 0; i < duplicateElements.size(); i++) {
    cout << duplicateElements[i] << " ";
  }
  //
}