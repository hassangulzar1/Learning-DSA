#include <iostream>
using namespace std;
//! POWER OF TWO NUMBERS FUNCTION
// int power()
// {
//     int a, b;
//     cin >> a >> b;
//
//     int ans = 1;
//     for (int i = 1; i <= b; i++)
//     {
//         ans *= a;
//     }
//     return ans;
// }

//! EVEN OR ODD  FUNCTION
// int evenODD(int a)
// {
//     if (a & 1)
//     {
//         return 0;
//     }
//
//     return 1;
// }

//! NCR  FUNCTION
// int factorial(int n)
// {
//     int ans = 1;
//     for (int i = 1; i <= n; i++)
//     {
//         ans *= i;
//     }
//     return ans;
// }
//
// int nCr(int n, int r)
// {
//     int num = factorial(n);
//     int denom = factorial(r) * factorial(n - r);
//     return num / denom;
// }

//! COUNTING FUNTION
void printCounting(int n)
{
    for (int i = 1; i <= n; i++)
    {
        cout << i << endl;
    }
}
int main()
{
    //! SWITCH STATEMENT
    //     char ch = 'a';
    //     cout << endl;
    //     switch (ch)
    //     {
    //     case 1:
    //         cout << "FIRST" << endl;
    //         break;
    //     case '1':
    //         cout << "character one" << endl;
    //         break;
    //
    //     default:
    //         cout << "IT is default case" << endl;
    //         break;
    //     }

    // !HOME WORK
    //     int n = 2;
    //     while (2)
    //     {
    //         switch (n)
    //         {
    //         case 2:
    //             cout << "HELLO" << endl;
    //
    //         default:
    //             break;
    //         }
    //         exit(0);
    //     }

    //     int a, b;
    //     cout << " Enter the value of a" << endl;
    //     cin >> a;
    //
    //     cout << " Enter the value of b" << endl;
    //     cin >> b;
    //
    //     char op;
    //     cout << " Enter the operation you want to perform" << endl;
    //     cin >> op;
    //
    //     switch (op)
    //     {
    //     case '+':
    //         cout << (a + b) << endl;
    //         break;
    //
    //     case '-':
    //         cout << (a - b) << endl;
    //         break;
    //
    //     case '*':
    //         cout << (a * b) << endl;
    //         break;
    //
    //     case '/':
    //         cout << (a / b) << endl;
    //         break;
    //
    //     case '%':
    //         cout << (a % b) << endl;
    //         break;
    //
    //     default:
    //         cout << "Please enter a valid operation" << endl;
    //         break;
    //     }

    //! HOME WORK
    //     int amount;
    //     cout << "Enter the amount" << endl;
    //     cin >> amount;
    //     int Rs100, Rs50, Rs20, Rs1;
    //
    //     switch (1)
    //     {
    //     case 1:
    //         Rs100 = amount / 100;
    //         amount = amount % 100;
    //         cout << "No of 100 Rupee notes required are=" << Rs100 << endl;
    //
    //     case 2:
    //         Rs50 = amount / 50;
    //         amount = amount % 50;
    //         cout << "No of 50 Rupee notes required are=" << Rs50 << endl;
    //
    //     case 3:
    //         Rs20 = amount / 20;
    //         amount = amount % 20;
    //         cout << "No of 20 Rupee notes required are=" << Rs20 << endl;
    //
    //     case 4:
    //         Rs1 = amount / 1;
    //         amount = amount % 1;
    //         cout << "No of 1 Rupee notes required are=" << Rs1 << endl;
    //     }

    //! POWER FUNCTIONS
    // cout << "Answer: " << power() << endl;

    //! NUMBER IS EVEN OR ODD FUNCTIONS
    // int a;
    // cin >> a;
    // if (evenODD(a))
    // {
    //     cout << "Number is even" << endl;
    // }
    // else
    // {
    //     cout << "Number is Odd" << endl;
    // }

    //! NCR FUNCTION
    // int n, r;
    // cin >> n >> r;
    // cout << "Answer: " << nCr(n, r) << endl;

    //! Counting Function

    int n;
    cin >> n;
    printCounting(n);
}
