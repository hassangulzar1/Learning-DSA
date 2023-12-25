#include <iostream>
using namespace std;
int main()
{

    //! FIRST PROBLEM
    //     int x = 123;
    //     int ans = 0;
    //     while (x != 0)
    //     {
    //         int digit = x % 10;
    //         if ((ans > INT_MAX / 10) || (ans < INT_MIN / 10))
    //         {
    //             return 0;
    //         }
    //
    //         ans = ((ans * 10) + digit);
    //         x = x / 10;
    //     }
    //     return ans;

    //! SECOND PROBLEM
    //     int n;
    //     cin >> n;
    //     int m = n;
    //     int mask = 0;
    //     if (n == 0)
    //     {
    //         return 1;
    //     }
    //     while (m != 0)
    //     {
    //         mask = (mask << 1) | 1;
    //         m = m >> n;
    //     }
    //     int ans = (~n) & mask;
    //     return ans;

    int n;
    cin >> n;
    cout << (n >> 1) << endl;
}