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

    char a;
    cin >> a;
    if (int(a) >= 97 && int(a) <= 122)
    {
        cout << "This is loweCase" << endl;
    }
    else if (int(a) >= 65 && int(a) <= 90)
    {
        cout << "this is UpperCase" << endl;
    }
    else if (int(a) >= 48 && int(a) <= 57)
    {
        cout << "This is numeric" << endl;
    }
}
