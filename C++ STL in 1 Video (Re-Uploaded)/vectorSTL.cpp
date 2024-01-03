#include <iostream>
#include <vector>
using namespace std;

int main() {
  vector<int> v;
  vector<int> a{5, 1};

  vector<int> last(a);

  cout << "Print last" << endl;
  for (int i : last) {
    cout << i << " ";
  }

  cout << endl;
  cout << "Size-> " << v.capacity() << endl;
  v.push_back(1);
  cout << "Size-> " << v.capacity() << endl;
  v.push_back(2);
  cout << "Size-> " << v.capacity() << endl;
  v.push_back(3);
  cout << "Size-> " << v.capacity() << endl;

  cout << "Front->" << v.front() << endl;
  cout << "back->" << v.back() << endl;

  cout << "Before Pop " << endl;
  for (int i : v) {
    cout << i << " ";
  }
  cout << endl;
  v.pop_back();

  cout << "after Pop " << endl;
  for (int i : v) {
    cout << i << " ";
  }

  cout << "Before clear->" << v.size() << endl;
  v.clear();
  cout << "AFter clear->" << v.size() << endl;
}