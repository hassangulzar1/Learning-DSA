num = 5

def sumOfNum(n):
    if n <= 1:
        return n
    
    
    return n + sumOfNum(n - 1)


print(sumOfNum(num))