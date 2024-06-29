class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
       
        maxElem = -1
        n = len(arr)

        if n == 0:
           return []

        for  i in range(n -1,-1,-1):
            curr = arr[i]
            arr[i] = maxElem

            if maxElem < curr:
                maxElem = curr

        return arr


        