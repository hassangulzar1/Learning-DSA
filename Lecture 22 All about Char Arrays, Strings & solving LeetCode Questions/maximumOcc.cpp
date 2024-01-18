#include <iostream>

using namespace std;

char getMaxOcc(string s) {
  int arr[26] = {0};

  // create an array of count of character

  for (int i = 0; i < s.length(); i++) {
    int ch = s[i];

    int number = 0;
    number = ch - 'a';

    arr[number]++;
  }

  int maxi = -1, ans = 0;

  for (int i = 0; i < 26; i++) {
    if (maxi < arr[i]) {
      ans = i;
      maxi = arr[i];
    }
  }

  char finalAns = 'a' + ans;
  return finalAns;
}

int main() {
  string s;
  cin >> s;

  cout << getMaxOcc(s) << endl;
  return 0;
}