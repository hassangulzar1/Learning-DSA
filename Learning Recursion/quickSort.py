def quichSort(nums,low,hi):
    if low >= hi:
        return
    
    s = low
    e = hi
    mid = (s + e) // 2
    pivot = nums[mid]

    while s <= e:
        while nums[s] < pivot:
            s += 1
        while nums[e] > pivot:
            e -= 1
        
        if s <= e:
            temp = nums[s]
            nums[s] = nums[e]
            nums[e] = temp
            s += 1
            e -= 1

    quichSort(nums,low,e)
    quichSort(nums,s, hi)

arr = [5,4,3,2,1,6]
quichSort(arr,0,len(arr)-1)
print(arr)
