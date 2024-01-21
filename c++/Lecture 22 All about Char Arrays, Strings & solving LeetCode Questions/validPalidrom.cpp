#include <iostream>
using namespace std;

bool valid(char ch) {
  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ||
      (ch >= '0' && ch <= '9')) {
    return 1;
  }
  return 0;
}

char toLowerCase(char ch) {
  if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
    return ch;
  } else {
    int temp = ch - 'A' + 'a';
    return temp;
  }
}

bool checkPalidrom(string a) {
  int st = 0;
  int end = a.length() - 1;

  while (st <= end) {
    if (a[st] != a[end]) {
      return 0;
      break;
    } else {
      st++;
      end--;
    }
  }
  return 1;
}
int main() {
  string s = "hassan";

  string temp = "";
  for (int i = 0; i < s.length(); i++) {
    if (valid(s[i])) {
      temp.push_back(s[i]);
    }
  }

  // lowerCase

  for (int i = 0; i < temp.length(); i++) {
    temp[i] = toLowerCase(temp[i]);
  }

  return checkPalidrom(temp);
}