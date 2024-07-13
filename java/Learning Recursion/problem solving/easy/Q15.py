num = 11

def findPrime(n,i = 2):
    if n <= 2:
        return True if (n == 2) else False
    
    if n % i == 0:
        return False
    
    if i * i > n:
        return True
    
    return findPrime(n,i+1)
    
print(findPrime(num))

    

    
    