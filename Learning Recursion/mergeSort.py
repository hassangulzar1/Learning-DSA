
def merge(left,right):
    mixArr  = [0] * (len(left) + len(right))

    i ,j,k = 0,0,0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            mixArr[k] = left[i]
            i +=1
        else:
            mixArr[k] = right[j]
            j +=1
        k+=1
    
    while i < len(left):
        mixArr[k] = left[i]
        i += 1
        k += 1
    while j < len(right):
        mixArr[k] = right[j]
        j += 1
        k += 1
    return mixArr

    

def mergeSort(arr):
    if len(arr) == 1:
        return arr
    mid = len(arr) // 2

    left = mergeSort(arr[0:mid])
    right = mergeSort(arr[mid:len(arr)])

    return merge(left,right)

myArr = [5,4,3,2,1]

print(mergeSort(myArr))