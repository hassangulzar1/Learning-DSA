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

    int n;
    cin >> n;

    while (n != 0)
    {
        cout << n % 10 << endl;
        n = n >> 1;
    }

    // int ans = 0;
    // int i = 0;
    //     while (n != 0)
    //     {
    //         int bit = n & 1;
    //         ans = (bit * pow(10, i) + ans);
    //
    //         n = n >> 1;
    //         i++;
    //     }
    //     cout << ans << endl;
}
