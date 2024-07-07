array = [20, 20, 78 ,98 ,99, 97]

def arrayIsSorted(arr,n):
    if n == 1:
        return True
    
    arrayIsSorted(arr,n-1)

    if arr[n] <= arr[n + 1]:
        return True
    else:
        return False
    
print(arrayIsSorted(array,len(array)-2) )
