#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

bool isPossible(vector<int> arr, int m, int mid) {
  int sum = 0;

  for (int i = 0; i < arr.size(); i++) {
    if (arr[i] <= mid) {
      continue;
    } else {
      sum += arr[i] - mid;
    }
  }

  if (sum <= m) {
    return true;
  }
  return false;
}

int main() {
  vector<int> arr = {4, 42, 40, 26, 46};
  int m = 20;
  sort(arr.begin(), arr.end());

  int s = 0;
  int e = arr[arr.size() - 1];
  int mid = s + (e - s) / 2;
  int ans = -1;
  while (s <= e) {
    if (isPossible(arr, m, mid)) {
      ans = mid;
      e = mid - 1;
    } else {
      s = mid + 1;
    }

    mid = s + (e - s) / 2;
  }

  cout << ans << endl;
}