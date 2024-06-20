

myArr = [1,3,34,222,7878]
target = 222


def searching(arr,tar,s,e):
    if s > e:
        return -1
    
    mid = s + e //2

    if arr[mid] == tar:
        return mid
    if arr[mid] < tar:
        return searching(arr,tar,mid + 1,e)
    
    return searching(arr,tar,s,mid - 1)

print(searching(myArr,target,0,len(myArr)- 1)) 