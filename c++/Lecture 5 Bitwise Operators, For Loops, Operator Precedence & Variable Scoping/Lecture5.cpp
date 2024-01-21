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
    // for (int a = 0, b = 1; a >= 0 && b >= 1; a--, b--)
    // {
    //     cout << a << " " << b << endl;
    // }

    // int sum = 0;
    // for (int i = 1; i <= 10; i++)
    // {
    //     sum += i;
    // }
    // cout << sum << endl;

    // int n = 5;
    // int a = 0;
    // int b = 1;
    // for (int i = 1; i <= n; i++)
    // {
    //     int sum = a + b;
    //     cout << sum << endl;
    //     a = b;
    //     b = sum;
    // }

    //! Prime Number with break statement
    //     int n = 7;
    //     bool val = 1;
    //
    //     for (int i = 2; i < n; i++)
    //     {
    //         if (n % i == 0)
    //         {
    //             val = 0;
    //             break;
    //         }
    //     }
    //
    //     if (val == 0)
    //     {
    //         cout << "Not A Prime Number" << endl;
    //     }
    //     else
    //     {
    //         cout << "Is a prime number" << endl;
    //     }
    //! HOme work
    // for (int i = 0; i <= 5; i--)
    // {
    //     cout << i << " ";
    //     i++;
    // }

    // for (int i = 0; i <= 15; i += 2)
    // {
    //     cout << i << " ";
    //     if (i & 1)
    //     {
    //         continue;
    //     }
    //     i++;
    // }

    // for (int i = 0; i < 5; i++)
    // {
    //     for (int j = i; j <= 5; j++)
    //     {
    //         if (i + j == 10)
    //         {
    //             break;
    //         }
    //         cout << i << " " << j << endl;
    //     }
    // }

    //! leetcode first problem

    // int pro = 1;
    // int sum = 0;
    // int n = 123;
    // while (n != 0)
    // {
    //     cout << n % 10 << endl;
    //     n = n / 10;
    // }

    //! leetcode second problem
    //     int count = 0;
    //     int n = 11;
    //     while (n != 0)
    //     {
    //         if (n & 1)
    //         {
    //             count++;
    //         }
    //
    //         n = n >> 1;
    //     }
    //
    //     cout << count << endl;
}