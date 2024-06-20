
def printN(n):
    print(n)
    if n == 5:        
     return n
    printN(n + 1)

printN(1)