#include <algorithm>
#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

int main() {
  //   vector<int> ans;
  //
  //   int count = 1;
  //   int arr[6] = {1, 2, 2, 1, 1, 3};
  //   for (int i = 0; i < 6; i++) {
  //     if (arr[i] == 0) continue;
  //
  //     for (int j = i + 1; j < 6; j++) {
  //       if (arr[i] == arr[j]) {
  //         arr[j] = 0;
  //         count++;
  //       }
  //     }
  //
  //     ans.push_back(count);
  //     count = 1;
  //     arr[i] = 0;
  //   }
  //   sort(ans.begin(), ans.end());
  //   for (int i = 0; i < ans.size(); i++) {
  //     cout << ans[i] << " ";
  //
  //     if (ans[i] == ans[i + 1]) {
  //       cout << "false" << endl;
  //   return false;
  //     }
  //   }
  //
  //   cout << "true" << endl;
  //   return true;

  //! Solved Code

  vector<int> ans;

  int arr[5] = {1, 2, 3, 4, 5};

  for (int i = 0; i < 5; ++i) {
    if (arr[i] != 0) {
      int count = 1;

      for (int j = i + 1; j < 5; ++j) {
        if (arr[i] == arr[j]) {
          arr[j] = 0;
          ++count;
        }
      }

      ans.push_back(count);
    }
  }

  sort(ans.begin(), ans.end());

  for (int i = 0; i < ans.size() - 1; ++i) {
    if (ans[i] == ans[i + 1]) {
      return false;
    }
  }

  return true;
}