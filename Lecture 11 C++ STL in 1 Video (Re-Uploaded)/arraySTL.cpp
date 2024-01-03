#include <array>
#include <iostream>
using namespace std;

int main() {
  int basic[4] = {1, 2, 3};
  array<int, 4> a = {1, 2, 3, 4};

  int size = a.size();
  for (int i = 0; i < size; i++) {
    cout << a[i] << endl;
  }

  cout << "Element at 2nd Index-> " << a.at(2) << endl;
  cout << "Empty or Not-> " << a.empty() << endl;

  cout << "First Element-> " << a.front() << endl;
  cout << "Last Element->" << a.back() << endl;
}