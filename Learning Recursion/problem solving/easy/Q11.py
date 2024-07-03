array = [64, 34, 25, 12, 22, 11, 90] 

def bubbleSort(n,arr):

    count = 0

    if n == 1:
        return
    
    for i in range(n-1):
        if arr[i] > arr[i+1]:
            temp = arr[i]
            arr[i] = arr[i + 1]
            arr[i + 1] = temp
            count += 1
    
    
    bubbleSort(n-1,arr)

bubbleSort(len(array), array)

print(array)

    