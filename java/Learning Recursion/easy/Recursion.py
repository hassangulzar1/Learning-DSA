
# def printN(n):
#     print(n)
#     if n == 5:        
#      return n
#     printN(n + 1)
# 
# printN(1)

def fibo(n):
   if n < 2:
      return n
   return fibo(n -1) + fibo(n -2)

print(fibo(7))