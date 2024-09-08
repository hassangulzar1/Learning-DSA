class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        indexSav = {}
        large = -1

        for i in range(len(s)):
            if s[i] in indexSav:
                large = max(large,i- indexSav[s[i]] - 1 ) 
            else:
                indexSav[s[i]] = i
        return large
        