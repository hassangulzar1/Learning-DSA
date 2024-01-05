#include <algorithm>
#include <iostream>
#include <set>
#include <vector>
using namespace std;
int main() {
  vector<int> arr = {10, 5, 5, 5, 2};
  set<vector<int>> visited;
  vector<vector<int>> ans;
  int K = 12;
  int n = arr.size();

  for (int i = 0; i < n - 2; i++) {
    for (int j = i + 1; j < n - 1; j++) {
      for (int k = j + 1; k < n; k++) {
        // If we find a valid triplet.
        if (arr[i] + arr[j] + arr[k] == K) {
          vector<int> triplet;
          triplet.push_back(arr[i]);
          triplet.push_back(arr[j]);
          triplet.push_back(arr[k]);
          // Sorting the triplet track distinct triplets.
          sort(triplet.begin(), triplet.end());
          if (visited.find(triplet) == visited.end()) {
            ans.push_back(triplet);
            visited.insert(triplet);
          }
        }
      }
    }
  }

  return ans;
}