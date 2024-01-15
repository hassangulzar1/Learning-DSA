#include <iostream>
#include <vector>
using namespace std;

int merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
  int i = 0;
  int j = 0;
  while (i < m && j < n) {
    int temp = nums1[i];
    if (nums1[i] < nums2[j]) {
      i++;
    }
  }
}
int main() {
  vector<int> nums1 = {1, 2, 3};
  int m = 3;
  vector<int> nums2 = {2, 5, 6};
  int n = 3;

  merge(nums1, m, nums2, n);

  for (int i = 0; i < nums1.size(); i++) {
    cout << nums1[i] << " ";
  }
}