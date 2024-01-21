#include <iostream>
#include <vector>
using namespace std;

bool isPossible(vector<int> &boards, int k, int mid) {
  int totalPainters = 1;
  int sumOfboards = 0;

  for (int i = 0; i < boards.size(); i++) {
    if (sumOfboards + boards[i] <= mid) {
      sumOfboards += boards[i];
    } else {
      totalPainters++;
      if (totalPainters > k || boards[i] > mid) {
        return false;
      }
      sumOfboards = boards[i];
    }
  }
  return true;
}

int main() {
  vector<int> boards = {48, 90};
  int k = 2;

  int s = 0;
  int sum = 0;
  for (int i = 0; i < boards.size(); i++) {
    sum += boards[i];
  }
  int e = sum;
  int mid = s + (e - s) / 2;
  int ans = -1;
  while (s <= e) {
    if (isPossible(boards, k, mid)) {
      ans = mid;
      e = mid - 1;
    } else {
      s = mid + 1;
    }
    mid = s + (e - s) / 2;
  }

  return ans;
}