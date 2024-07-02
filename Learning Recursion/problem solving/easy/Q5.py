def printNos(N):
        #Your code here
    if N == 0:
        return 
        
    printNos(N-1)
    print(N)

printNos(10)
