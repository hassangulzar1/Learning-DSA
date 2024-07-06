num = 16

def powerTwo(n):
    if n <= 0:
        return False
    elif n == 1:
        return True
    
    if n % 2 == 0:
        return powerTwo(n // 2)
    else:
        return False
    
print(powerTwo(num))
    
    