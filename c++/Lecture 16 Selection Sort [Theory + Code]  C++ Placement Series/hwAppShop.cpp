#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
  int n = 7;
  vector<int> arr = {10, 34, 12, 14, 54, 12, 15};
  int m = 4;
  sort(arr.begin(), arr.end());

  long long int sum = 0;
  for (int i = 0; i < n; i++) {
    sum += arr[i];
  }

  cout << sum - (arr[n - m]) << endl;
}