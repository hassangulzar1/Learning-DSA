n =45632

def sumOfDigit(n):
    if n == 0:
        return 0
    
    temp = n % 10
    
    return temp + sumOfDigit(n // 10)

print(sumOfDigit(n))
    