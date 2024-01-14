#include <iostream>
#include <vector>
using namespace std;

int main() {
  int n = 137;
  vector<int> arr = {
      91, 80, 1,  64, 14, 6,  72,  90, 25, 79, 65, 46,  49, 20, 58, 25, 92, 99,
      41, 22, 94, 73, 2,  70, 76,  37, 31, 82, 82, 100, 91, 97, 52, 29, 60, 29,
      95, 32, 25, 8,  37, 74, 100, 25, 62, 17, 51, 23,  62, 40, 79, 1,  31, 48,
      81, 64, 94, 48, 28, 55, 91,  76, 83, 44, 92, 25,  40, 74, 84, 63, 10, 25,
      53, 90, 81, 73, 71, 3,  93,  16, 30, 54, 64, 6,   28, 76, 12, 78, 43, 81,
      78, 43, 88, 78, 28, 16, 8,   39, 85, 71, 94, 28,  58, 98, 5,  48, 40, 11,
      30, 66, 43, 21, 41, 38, 77,  51, 77, 86, 53, 38,  62, 2,  36, 8,  32, 90,
      47, 83, 49, 8,  58, 76, 38,  79, 99, 63, 9};

  int lSum = arr[0];
  int rSum = arr[n - 1];

  //   if (n == 2 && arr[0] == arr[1]) {
  //     cout << lSum << endl;
  //   }

  int s = 1;
  int e = n - 2;

  while (s <= e) {
    if (lSum < rSum) {
      lSum += arr[s++];
      continue;
    } else if (lSum > rSum) {
      rSum += arr[e--];
      continue;
    } else if (lSum == rSum) {
      //   return lSum;
      cout << lSum << endl;
      break;
    }
  }
  if (lSum == rSum) {
    // return true;
    cout << lSum << endl;
  } else {
    cout << 0 << endl;
  }
}