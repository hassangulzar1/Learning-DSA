#include <iostream>
#include <math.h>
using namespace std;

int main()
{

    //! decimal to binary +ve numbers
    // int n;
    // cin >> n;
    //     int answer = 0;
    //     int i = 0;
    //     while (n != 0)
    //     {
    //         int bit = n & 1;
    //         answer = (bit * pow(10, i)) + answer;
    //
    //         n = n >> 1;
    //         i++;
    //     }
    //
    //     cout << answer << endl;

    //! decimal to binary -ve numbers
    //     long long int n;
    //     cin >> n;
    //     unsigned long long int i = 0, ans = 0;
    //     if (n < 0)
    //     {
    //         n = pow(2, 16) + n;
    //     }
    //
    //     while (n)
    //     {
    //         int lastBit = n & 1;
    //         ans = (lastBit * pow(10, i)) + ans;
    //         n = n >> 1;
    //         i++;
    //     }
    //
    //     cout << ans << endl;

    //! binary to decimal number conversion
    //     int n;
    //     cin >> n;
    //     int i = 0;
    //     int ans = 0;
    //     while (n != 0)
    //     {
    //         int digit = n % 10;
    //
    //         if (digit == 1)
    //         {
    //             ans += pow(2, i);
    //         }
    //         n = n / 10;
    //         i++;
    //     }
    //
    //     cout << ans << endl;

    int n;
    cin >> n;
    int ans = 0;
    while (n != 0)
    {
        int digit = n % 10;

        ans = (ans * 10) + digit;
        n = n / 10;
    }
    cout << ans << endl;
}