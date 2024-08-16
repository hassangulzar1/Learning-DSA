class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) > len(t):
            return False
        
        if s == "":
            return True
        
        curr = 0

        for charT in t:            
            if s[curr] == charT:
                curr += 1
            if curr == len(s):
                return True

        return False
        
        

        