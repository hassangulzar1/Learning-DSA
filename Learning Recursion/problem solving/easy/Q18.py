def factorial(n):
    # Write your code here
    if n <= 1:
        return n
    
    return n * factorial(n - 1)

print(factorial(3))