#include <iostream>
#include <string>
using namespace std;

char toLowerCase(char ch) {
  if (ch >= 'a' && ch <= 'z') {
    return ch;
  } else {
    int temp = ch - 'A' + 'a';
    return temp;
  }
}

string removeNotNeed(string s) {
  string newStr;
  for (int i = 0; i < s.size(); i++) {
    if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= 'a' && s[i] <= 'z')) {
      newStr += toLowerCase(s[i]);
    } else if (s[i] >= '0' && s[i] <= '9') {
      newStr += s[i];
    }
  }
  return newStr;
}

int main() {
  string s = "codingninjassajNiNgNidoc";
  string str = removeNotNeed(s);

  int st = 0;
  int end = str.size() - 1;

  while (st <= end) {
    if (str[st] != str[end]) {
      cout << "No" << endl;
      break;
    } else {
      st++;
      end--;
    }
  }
  cout << "Yes" << endl;
}
