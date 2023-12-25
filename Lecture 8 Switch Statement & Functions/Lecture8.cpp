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
// void printCounting(int n)
// {
//     for (int i = 1; i <= n; i++)
//     {
//         cout << i << endl;
//     }
// }

//! NUMBER IS PRIME OR NOT
// bool isPrime(int n)
// {
//     for (int i = 2; i < n; i++)
//     {
//         if (n % i == 0)
//         {
//             return 0;
//         }
//     }
//
//     return 1;
// }

//! A . P FUNCTION
// int ap(int n)
// {
//     return ((3 * n) + 7);
// }

//! HOME WORK QUESTION NO 2
// int setBits(int a, int b)
// {
//     int bitsOfa = 0;
//     int bitsOfb = 0;
//     while (a != 0)
//     {
//         if (a & 1)
//         {
//             bitsOfa++;
//         }
//         a = a >> 1;
//     }
//     while (b != 0)
//     {
//         if (b & 1)
//         {
//             bitsOfb++;
//         }
//         b = b >> 1;
//     }
//
//     return bitsOfa + bitsOfb;
// }

//! HOME WORK QUESTION NO 3
// int Fabonacci(int a)
// {
//     int x = 0;
//     int y = 1;
//
//     for (int i = 2; i < a; i++)
//     {
//         int next = x + y;
//         x = y;
//         y = next;
//     }
//     return y;
// }

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
    // int n;
    // cin >> n;
    // printCounting(n);

    //! NUMBER IS PRIME OR NOT FUNCION
    // int n;
    // cin >> n;
    // if (isPrime(n))
    // {
    //     cout << n << " is a Prime number";
    // }
    // else
    // {
    //     cout << n << " is not Prime number";
    // }

    //! HOME WORK QUSTION 1
    // int n;
    // cin >> n;
    // cout << ap(n) << endl;

    //! HOME WORK QUSTION 2
    // int a, b;
    // cin >> a >> b;
    // cout << setBits(a, b) << endl;

    //! HOME WORK QUSTION 3
    // int n;
    // cin >> n;
    // cout << Fabonacci(n) << endl;
}
