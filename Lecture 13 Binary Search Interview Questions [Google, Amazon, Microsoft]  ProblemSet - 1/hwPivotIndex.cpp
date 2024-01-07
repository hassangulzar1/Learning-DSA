#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
  //   vector<int> nums = {-1, -1, -1, -1, 0, 1};
  //
  //   int n = nums.size();
  //
  //   int totalSum = 0;
  //   int leftSum = 0;
  //
  //   for (int i = 0; i < n; i++) {
  //     totalSum += nums[i];
  //   }
  //
  //   for (int i = 0; i < n; i++) {
  //     int rightSum = totalSum - nums[i] - leftSum;
  //
  //     if (leftSum == rightSum) {
  //       return i;
  //     } else {
  //       leftSum += nums[i];
  //     }
  //   }
  //
  //   return -1;

  vector<int> nums = {1, 7, 3, 6, 5, 6};
  vector<int> leftSum(nums.size(), nums[0]);
  vector<int> rightSum(nums.size(), nums[nums.size() - 1]);

  if (nums.size() < 1) {
    cout << -1 << endl;
  }

  int s = 1;
  int e = nums.size() - 1;
  while (s != nums.size()) {
    leftSum[s] = leftSum[s - 1] + nums[s];
    rightSum[(nums.size() - 1) - s] =
        nums[(nums.size() - 1) - s] + rightSum[(nums.size() - 1) - s + 1];
    s++;
  }

  for (int i = 0; i < leftSum.size(); i++) {
    if (rightSum[i] == leftSum[i]) {
      cout << i << endl;
    }
  }
}