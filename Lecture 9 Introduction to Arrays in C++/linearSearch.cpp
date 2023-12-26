#include <iostream>
using namespace std;

bool search(int arr[], int size, int key) {
  for (int i = 0; i < size; i++) {
    if (arr[i] == key) {
      return 1;
    }
  }

  return 0;
}

int main() {
  int arr[10] = {4, 2, 4, 2, -3, 5, 22, 1, 7, 8};
  //  Whether 1 is present in it or not?
  cout << " Enter the element to search for " << endl;
  int key;
  cin >> key;

  bool found = search(arr, 10, key);

  if (found) {
    cout << "Key is present" << endl;
  } else {
    cout << "Key is absent" << endl;
  }
}
