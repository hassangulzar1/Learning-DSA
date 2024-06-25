arr = [5,6,7,8,9,1,2,3,4]

def BinarySearch(arr,s,e,tar):
    if s > e:
        return -1
    
    mid = (s + e) // 2

    if arr[mid] == tar:
        return mid
    
    if arr[s] <= arr[mid]:
        if tar >= arr[s] and tar <= arr[mid]:
           return BinarySearch(arr,s,mid -1 , tar)
        else:
           return BinarySearch(arr,mid + 1,e , tar)
    
    if tar >= arr[mid] and tar <= arr[e]:
        return BinarySearch(arr,mid + 1,e , tar)
    else:
        return BinarySearch(arr,s,mid - 1 , tar)
    
print(BinarySearch(arr,0,len(arr) - 1,9))


    
