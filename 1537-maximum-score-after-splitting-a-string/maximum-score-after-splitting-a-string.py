class Solution:
    def maxScore(self, s: str) -> int:
        zero,ones = 0, s.count("1")

        res = 0

        for i in range(len(s)- 1):
            if s[i] == "0":
                zero += 1
            else:
                ones -= 1

            res = max(res, ones+zero )
        
        return res
            


        
        