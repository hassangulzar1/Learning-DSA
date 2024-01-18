#include <iostream>

using namespace std;

int main() {
  string s = "hassan";
  string part = "ss";

  while (s.length() != 0 && s.find(part) < s.length()) {
    s.erase(s.find(part), part.length());
  }
  cout << s << endl;
  //   return s;
}