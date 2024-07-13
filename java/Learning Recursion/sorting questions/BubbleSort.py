myArr = [4,3,2,1]

def bubbleSort(arr,r,c):
    if r == 0:
        return
    
    if c < r:
        if arr[c] > arr[c + 1]:
            # swap 
            temp = arr[c]
            arr[c] = arr[c+1]
            arr[c+1]=temp

        bubbleSort(arr,r,c+1)
    else:
        bubbleSort(arr,r-1,0)

bubbleSort(myArr,len(myArr) - 1,0)
print(myArr)