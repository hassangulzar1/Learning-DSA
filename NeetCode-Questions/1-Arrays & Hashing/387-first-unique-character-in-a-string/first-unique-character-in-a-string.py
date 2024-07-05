class Solution:
    def firstUniqChar(self, s: str) -> int:
        res = {}

        for i,ch in enumerate(s):
            res[ch] = 1 + res.get(ch,0)
        
        for i in range(len(s)):
            if res.get(s[i]) == 1:
                return i
        
        return -1
                
        