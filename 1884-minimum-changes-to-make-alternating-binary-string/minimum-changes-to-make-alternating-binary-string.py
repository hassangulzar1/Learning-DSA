class Solution:
    def minOperations(self, s: str) -> int:
        copy = s
        firstCount = 0

        for i in range(len(s)):
            if i % 2 == 0:
                if copy[i] != "1":
                    firstCount +=1
            else:
                if copy[i] != "0":
                    firstCount += 1
        countSecond = 0      

        for i in range(len(s)):
            if i % 2 == 0:
                if copy[i] != "0":
                    countSecond +=1
            else:
                if copy[i] != "1":
                    countSecond += 1   

        return min(firstCount,countSecond)
                


        
        