#include <iostream>

using namespace std;

int main() {
  int n = 22;
  int s = 0;
  int e = n;
  long long int mid = s + (e - s) / 2;

  int ans = -1;
  while (s <= e) {
    long long int sqrt = mid * mid;

    if (sqrt == n) {
      return mid;
    } else if (sqrt < n) {
      ans = mid;
      s = mid + 1;
    } else {
      e = mid - 1;
    }
    mid = s + (e - s) / 2;
  }
  return ans;
}