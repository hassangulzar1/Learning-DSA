array = [20, 20, 78 ,98 ,99, 97]

def arrayIsSorted(arr,n):
    if n == 1 or n == 0:
        return True
    
    return arr[n - 1] <= arr[n] and arrayIsSorted(arr,n-1)
    
print(arrayIsSorted(array,len(array)-1) )
