#include <iostream>
using namespace std;

int main()
{
    //     int n;
    //     cin >> n;
    //     cout << "value of n is: " << n << endl;
    //
    //     if (n > 0)
    //     {
    //         cout << "N is Positive" << endl;
    //     }
    //     else
    //     {
    //         cout << "N is Negative" << endl;
    //     }

    // int a, b;
    // cin >> a >> b;
    // a = cin.get();

    // cout << "Value of A and b is: " << a << " " << b << endl;
    // cout << "Value of a is: " << a << endl;

    //     int a, b;
    //     cout << "Enter the value of a: " << endl;
    //     cin >> a;
    //     cout << "Enter the value of b: " << endl;
    //     cin >> b;
    //
    //     if (a > b)
    //     {
    //         cout << "A is a Greater Number" << endl;
    //     }
    //     if (a < b)
    //     {
    //         cout << "B is Greater Number" << endl;
    //     }

    // int a;
    // cin >> a;
    // if (a > 0)
    // {
    //     cout << "A is Positive" << endl;
    // }
    // else
    // {
    //     if (a < 0)
    //     {
    //         cout << "A is Negative" << endl;
    //     }
    //     else
    //     {
    //         cout << "A is 0" << endl;
    //     }
    // }

    // if (a > 0)
    // {
    //     cout << "A is Positive" << endl;
    // }
    // else if (a < 0)
    // {
    //     cout << "A is Negative" << endl;
    // }
    // else
    // {
    //     cout << "A is 0" << endl;
    // }

    //! HOME WORK
    // char a;
    // cin >> a;
    // if (int(a) >= 97 && int(a) <= 122)
    // {
    //     cout << "This is loweCase" << endl;
    // }
    // else if (int(a) >= 65 && int(a) <= 90)
    // {
    //     cout << "this is UpperCase" << endl;
    // }
    // else if (int(a) >= 48 && int(a) <= 57)
    // {
    //     cout << "This is numeric" << endl;
    // }

    //! While Loop
    // int i = 1;
    // int sum = 0;
    // while (i <= n)
    // {
    //     cout << i << endl;
    //     i++;
    // }

    // while (i <= 5)
    // {
    //     sum += i;
    //     i++;
    // }
    // cout << sum << endl;

    // !Practive
    // int i = 1;
    // int sumEven = 0;
    // while (i <= 5)
    // {
    //     if (i % 2 == 0)
    //     {
    //         sumEven += i;
    //     }
    //     i++;
    // }
    // cout << sumEven << endl;

    //! PRIME NUMBER
    // int n;
    // cin >> n;
    // int i = 2;
    // while (i < n)
    // {
    //     if (n % i == 0)
    //     {
    //         cout << "Your Number is Not Prime" << endl;
    //     }
    //     i++;
    // }

    //! PATTERN 1
    // int n;
    // cin >> n;
    // int i = 1;
    // while (i <= n)
    // {
    //     int j = 1;
    //     while (j <= n)
    //     {
    //         cout << "*";
    //         j++;
    //     }
    //     cout << endl;
    //     i++;
    // }

    //! PATTERN 2
    int n;
    cin >> n;
    int i = 1;
    while (i <= n)
    {
        int j = 1;
        while (j <= n)
        {
            cout << i;
            j++;
        }
        cout << endl;
        i++;
    }
}
