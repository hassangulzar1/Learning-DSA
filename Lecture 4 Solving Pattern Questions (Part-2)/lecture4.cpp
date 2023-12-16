#include <iostream>
using namespace std;

int main()
{

    //! 1st PATTERN
    // int n;
    // cin >> n;
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         cout << j;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    //! 2nd PATTERN
    // int n;
    // cin >> n;
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         cout << n - j + 1;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    //! 3rd PATTERN
    //     int n;
    //     cin >> n;
    //     int i = 1;
    //     int count = 1;
    //
    //     while (i <= n)
    //     {
    //         int j = 1;
    //         while (j <= n)
    //         {
    //             cout << count;
    //             j++;
    //             count++;
    //         }
    //         cout << endl;
    //         i++;
    //     }

    // ! 4th PATTERN
    // int n;
    // cin >> n;
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= i)
    //     {
    //         cout << "*";
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    // ! 5th PATTERN
    //     int n;
    //     cin >> n;
    //     int i = 1;
    //
    //     while (i <= n)
    //     {
    //         int j = 1;
    //         while (j <= i)
    //         {
    //             cout << i;
    //             j++;
    //         }
    //         cout << endl;
    //         i++;
    //     }

    // ! 6th PATTERN
    // int n;
    // cin >> n;
    // int i = 1;
    // int sum = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= i)
    //     {
    //         cout << sum;
    //         sum++;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    // ! 7th PATTERN
    //     int n;
    //     cin >> n;
    //     int i = 1;
    //     while (i <= n)
    //     {
    //         int j = i;
    //         while (j < i * 2)
    //         {
    //             cout << j;
    //             j++;
    //         }
    //         cout << endl;
    //         i++;
    //     }

    // ! 8th PATTERN
    // int n;
    // cin >> n;
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= i)
    //     {
    //         cout << i - j + 1;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    // ! 9th PATTERN
    // int n;
    // cin >> n;
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         char ch = 'A' + i - 1;
    //         cout << ch;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    // ! 10th PATTERN
    // int n;
    // cin >> n;
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         char ch = 'A' + j - 1;
    //         cout << ch;
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    // ! 11th PATTERN
    int n;
    cin >> n;
    int i = 1;

    while (i <= n)
    {
        int j = 1;
        char ch = 'A' + i - j;
        while (j <= n)
        {
            cout << ch;
            ch += 1;
            j++;
        }
        cout << endl;
        i++;
    }
}