#include <iostream>
#include <vector>
using namespace std;

void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
  int i = m - 1;      // Index for nums1
  int j = n - 1;      // Index for nums2
  int k = m + n - 1;  // Index for the merged array

  // Merge from the end to the beginning
  while (i >= 0 && j >= 0) {
    if (nums1[i] > nums2[j]) {
      nums1[k--] = nums1[i--];
    } else {
      nums1[k--] = nums2[j--];
    }
  }

  // If there are remaining elements in nums2, copy them to nums1
  while (j >= 0) {
    nums1[k--] = nums2[j--];
  }
}

void print(vector<int>& nums1) {
  for (int i = 0; i < 6; i++) {
    cout << nums1[i] << " ";
  }
}
int main() {
  vector<int> nums1 = {1, 2, 3};
  int m = 3;
  vector<int> nums2 = {2, 5, 6};
  int n = 3;

  merge(nums1, m, nums2, n);

  print(nums1);

  return 0;
}