array = [64, 34, 25, 12, 22, 11, 90] 

def insertionSort(n,arr):
    if n == 1:
        return
    
    insertionSort(n-1,arr)

    for i in range(n - 1 , 0 , -1):

        if arr[i] < arr[i - 1]:
            temp = arr[i - 1]
            arr[i - 1] = arr[i]
            arr[i] = temp
        else:
            break

insertionSort(len(array),array) 
print(array)