#include <iostream>
using namespace std;

int main() {
  int arr[5] = {1, 1, 2, 2, 3};

  int exist = 0;
  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      if (arr[i] == arr[j]) {
        exist++;
      }
    }

    if (exist == 1) {
      cout << arr[i] << endl;
    }

    exist = 0;
  }
}