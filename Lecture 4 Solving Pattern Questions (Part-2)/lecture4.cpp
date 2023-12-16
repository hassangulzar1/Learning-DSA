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
    int n;
    cin >> n;
    int i = 1;
    while (i <= n)
    {
        int j = 1;
        while (j <= i)
        {
            cout << "*";
            j++;
        }
        cout << endl;
        i++;
    }
}