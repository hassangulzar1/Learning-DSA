class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ans = [0] * 26

        for ch in s:
            ans[ord(ch) - ord("a")] += 1
        for ch in t:
            ans[ord(ch) - ord("a")] -= 1
        
        for i in range(26):
            if ans[i] != 0:
                return False
        return True



