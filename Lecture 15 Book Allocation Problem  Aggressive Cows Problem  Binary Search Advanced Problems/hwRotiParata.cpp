#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

bool isPossible(vector<int> a, int n, int mid, int par) {
  int totalPar = 0;
  int itr = 0;

  for (int i = 0; i < n; i++) {
    int time = 0;
    int j = 1;

    while (time + (a[i] * j) <= mid) {
      ++totalPar;
      time += (a[i] * j);
      ++j;
    }

    if (totalPar >= par) {
      return true;
    }
  }

  return false;
}

int main() {
  int t;
  cin >> t;
  while (t--) {
    int par, n;
    cin >> par >> n;

    vector<int> a;

    for (int i = 0; i < n; i++) {
      int e;
      cin >> e;
      a.push_back(e);
    }

    int s = 0;
    int maxElement = *max_element(a.begin(), a.end());
    int e = maxElement * (par * (par + 1) / 2);

    int mid = s + (e - s) / 2;
    int ans = -1;

    while (s <= e) {
      if (isPossible(a, n, mid, par)) {
        ans = mid;
        e = mid - 1;
      } else {
        s = mid + 1;
      }
      mid = s + (e - s) / 2;
    }

    cout << ans << endl;
  }

  return 0;
}