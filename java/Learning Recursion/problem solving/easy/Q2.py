myArr = [3, 2, 1, 56, 10000, 167]
def get_min_max(arr):

    def findMin(arr,n):
        if n == 1:
            return arr[0]
        
        return min(arr[n -1],findMin(arr,n-1))
    
    def findMax(arr,n):
        if n == 1:
            return arr[0]
        
        return max(arr[n -1],findMax(arr,n-1))
    
    return [findMin(arr,len(arr)), findMax(arr,len(arr))]

print(get_min_max(myArr))