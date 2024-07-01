def search(arr,tar,s,e):
    if s > e:
        return -1
    
    mid = (s + e)//2

    if arr[mid] == tar:
        return mid
    
    if arr[mid] < tar:
       return search(arr,tar,mid+1,e)
    else:
       return search(arr,tar,s,mid-1)
    
nums = [-1,0,3,5,9,12]
target = 2

print(search(nums,target,0,len(nums)-1))
    