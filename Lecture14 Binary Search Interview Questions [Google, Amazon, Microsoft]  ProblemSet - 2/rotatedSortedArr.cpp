#include <iostream>
#include <vector>
using namespace std;

int findPivot(vector<int>& nums) {
  int s = 0;
  int e = nums.size() - 1;
  int mid = s + (e - s) / 2;

  while (s < e) {
    if (nums[mid] >= nums[0]) {
      s = mid + 1;
    } else {
      e = mid;
    }
    mid = s + (e - s) / 2;
  }

  return s;
}

int binarySearch(vector<int>& nums, int start, int end, int target) {
  int s = start;
  int e = end;

  int mid = s + (e - s) / 2;

  while (s <= e) {
    if (nums[mid] == target) {
      return mid;
    }

    if (nums[mid] < target) {
      s = mid + 1;
    } else {
      e = mid - 1;
    }
    mid = s + (e - s) / 2;
  }
  return -1;
}
int main() {
  vector<int> nums = {4, 5, 6, 7, 0, 1, 2};
  int target = 0;

  int pivot = findPivot(nums);

  if (target >= nums[pivot] && target <= nums[nums.size() - 1]) {
    return binarySearch(nums, pivot, nums.size() - 1, target);
  } else {
    return binarySearch(nums, 0, pivot - 1, target);
  }

  return 0;
}