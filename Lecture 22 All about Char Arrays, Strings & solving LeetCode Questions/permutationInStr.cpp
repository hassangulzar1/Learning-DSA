#include <iostream>
using namespace std;

bool checkEqual(int count1[26], int count2[26]) {
  for (int i = 0; i < 26; i++) {
    if (count1[i] != count2[i]) {
      return 0;
    }
  }

  return 1;
}

int main() {
  string s1 = "ab", s2 = "eidbaooo";

  int count1[26] = {0};

  for (int i = 0; i < s1.length(); i++) {
    int index = s1[i] - 'a';
    count1[index]++;
  }

  //   traversing 2nd time
  int count2[26] = {0};
  int i = 0;
  int windowSize = s1.length();

  while (i < windowSize && i < s2.length()) {
    int index = s2[i] - 'a';
    count2[index]++;
    i++;
  }

  if (checkEqual(count1, count2)) return 1;

  //! aage cheack kro
  while (i < s2.length()) {
    char newChar = s2[i];
    int index = newChar - 'a';
    count2[index]++;

    char oldHcar = s2[i - windowSize];
    index = oldHcar - 'a';
    count2[index]--;
    i++;

    if (checkEqual(count1, count2)) return 1;
  }

  return 0;
}