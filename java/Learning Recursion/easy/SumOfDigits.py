def sumOfDig(n):
    if not n:
        return 0
    return (n % 10) + sumOfDig(n // 10)

print(sumOfDig(123))
