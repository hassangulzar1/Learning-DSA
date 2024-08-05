class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def BS(arr,tar,s,e):
           if s > e:
             return -1
    
           mid = (s + e)//2

           if arr[mid] == tar:
             return mid
    
           if arr[mid] < tar:
             return BS(arr,tar,mid+1,e)
           else:
             return BS(arr,tar,s,mid-1)

        return BS(nums,target,0,len(nums)-1)
        