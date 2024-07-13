myArr = [4,7,3,6,7]

def printTriangle(arr,n):
    if n == 1:
        return arr
    
    temp = [0] * (n - 1)

    for i in range(len(temp)):
        temp[i] = arr[i] + arr[i+1]

    returnArr =  printTriangle(temp,n-1)

    return returnArr + arr
    

print(printTriangle(myArr, len(myArr) ))