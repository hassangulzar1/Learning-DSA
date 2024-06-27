def countZero(n,count):
    if n == 0:
        return count
    
    if n % 10 == 0:
       return countZero(n // 10,count + 1)
    
    return countZero(n // 10,count)
    
print(countZero(102000,0))