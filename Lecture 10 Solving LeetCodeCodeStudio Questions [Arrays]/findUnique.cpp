#include <iostream>
using namespace std;

int main() {
  //! BRUTEFORCE SOLUTION
  //   int arr[7] = {1, 1, 2, 2, 3, 3, 5};
  //
  //   int exist = 0;
  //   for (int i = 0; i < 7; i++) {
  //     for (int j = 0; j < 7; j++) {
  //       if (arr[i] == arr[j]) {
  //         exist++;
  //       }
  //     }
  //
  //     if (exist == 1) {
  //       cout << arr[i] << endl;
  //     }
  //
  //     exist = 0;
  //   }

  //! OPTIMIZE SOLUTION
  //   int ans = 0;
  //   int arr[5] = {1, 4, 1, 4, 5};
  //   for (int i = 0; i < 5; i++) {
  //     ans = ans ^ arr[i];
  //   }
  //   cout << ans << endl;
}