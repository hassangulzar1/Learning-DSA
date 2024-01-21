#include <iostream>
#include <vector>
using namespace std;

int main() {
  vector<vector<int> > ans;
  vector<int> arr = {1, 2, 3, 4, 5};

  for (int i = 0; i < arr.size(); i++) {
    for (int j = i + 1; j < arr.size(); j++) {
      if (arr[i] + arr[j] == 5) {
        vector<int> temp;
        temp.push_back(min(arr[i], arr[j]));
        temp.push_back(max(arr[i], arr[j]));
        ans.push_back(temp);
      }
    }
  }
}