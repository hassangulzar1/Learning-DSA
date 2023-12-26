#include <iostream>
using namespace std;

void printArray(int arr[], int size) {
  cout << "Printing The Array" << endl;
  for (int i = 0; i < size; i++) {
    cout << arr[i] << " ";
  }
  cout << "Printing Done" << endl;
}

int main() {
  //! entire array initilize with same value
  // int dost[1000] = {-1};
  // fill_n(dost, 1000, 3);
  // for (int i = 0; i < 1000; i++)
  // {
  //     cout << dost[i] << endl;
  // }

  //! Using Array with functions
  //      int third[15] = {2, 7};
  //      printArray(third, 15);
  //
  //      int fourth[10] = {0};
  //      printArray(fourth, 10);
  //
  //      int fifth[10] = {1};
  //      printArray(fifth, 10);
  //
  //      int fifthSize = sizeof(fifth) / sizeof(int);
  //      cout << " Size of Fifth is " << fifthSize << endl;

  return 0;
}