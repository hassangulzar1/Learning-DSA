#include <iostream>
using namespace std;

int main()
{
    //! Bitwise operator
    // int a = 4;
    // int b = 6;
    // cout << "a&b: " << (a & b) << endl;
    // cout << "a|b: " << (a | b) << endl;
    // cout << "~a: " << ~a << endl;
    // cout << "a^b: " << (a ^ b) << endl;

    //! left shift operator / Right Shift operator
    // cout << (17 >> 1) << endl;
    // cout << (17 >> 2) << endl;
    // cout << (19 << 1) << endl;
    // cout << (21 << 2) << endl;

    //! Inc/ Dex operator

    // int i = 7;
    // cout << (++i);
    // cout << (i++);
    // cout << (i--);
    // cout << (--i);

    //! for loop

    // int n;
    // cin >> n;
    // int i = 1;
    // for (;;)
    // {
    //     if (i <= n)
    //     {
    //         cout << i << endl;
    //     }
    //     else
    //     {
    //         break;
    //     }
    //     i++;
    // }
    //
    for (int a = 0, b = 1; a >= 0 && b >= 1; a--, b--)
    {
        cout << a << " " << b << endl;
    }
}