#include <algorithm>
#include <iostream>
using namespace std;

bool isPossible(int arr[], int n, int m, int mid) {
  long long int sum = 0;

  for (int i = 0; i < n; i++) {
    if (arr[i] > mid) sum += arr[i] - mid;
  }

  if (sum >= m) {
    return true;
  }
  return false;
}

int main() {
  long long int n, m;
  cin >> n >> m;
  int a[n];

  for (int i = 0; i < n; i++) cin >> a[i];

  int s = 0;
  int e = *max_element(a, a + n);
  int mid = s + (e - s) / 2;
  long long int ans = 0;
  while (s <= e) {
    if (isPossible(a, n, m, mid)) {
      ans = mid;
      s = mid + 1;
    } else {
      e = mid - 1;
    }

    mid = s + (e - s) / 2;
  }

  cout << ans << endl;
  return 0;
}