class Solution:
    def findLucky(self, arr: List[int]) -> int:
        hashMap = {}

        for i in arr:
            hashMap[i] = hashMap.get(i, 0) + 1
        
        highest = -1

        for key,val in hashMap.items():
            if key == val and key > highest:
                highest = key

        return highest
