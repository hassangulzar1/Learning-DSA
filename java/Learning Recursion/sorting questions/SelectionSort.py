myArr = [4,3,2,1]

def SelectionSort(arr,r,c,maxIn):
    if r == 0:
        return
    
    if c < r:
        if arr[c] > arr[maxIn]:
            SelectionSort(arr,r,c+1,c)
        else:
            SelectionSort(arr,r,c+1,maxIn)
    else:
        temp = arr[maxIn]
        arr[maxIn] = arr[r-1]
        arr[r-1]=temp

        SelectionSort(arr,r-1,0,0)

SelectionSort(myArr,len(myArr),0,0)
print(myArr)