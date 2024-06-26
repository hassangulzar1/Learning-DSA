class Solution:
    def findLucky(self, arr: List[int]) -> int:
        hashMap = {}

        for i in arr:
            if i not in hashMap:
                hashMap[i] = 1
            else:
                hashMap[i] +=1
        
        highest = -1

        for key,val in hashMap.items():
            if key == val and key > highest:
                highest = key
                
        return highest
