#include <deque>
#include <iostream>
using namespace std;

int main() {
  deque<int> d;
  d.push_back(1);
  d.push_front(2);

  //   for (int i : d) {
  //     cout << i << " ";
  //   }

  //   d.pop_front();
  //   cout << endl;
  //   for (int i : d) {
  //     cout << i << " ";
  //   }

  //   cout << "Print First Index Element-> " << d.at(1) << endl;

  cout << "Print First Element-> " << d.front() << endl;
  cout << "Print End  Element-> " << d.back() << endl;

  cout << "Empty or Not" << d.empty() << endl;

  cout << "before Erase " << d.size() << endl;
  d.erase(d.begin(), d.begin() + 1);
  cout << "After Erase " << d.size() << endl;
}