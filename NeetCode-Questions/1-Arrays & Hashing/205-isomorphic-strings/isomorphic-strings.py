class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        charMap = {}
        seCharMap = {}

        for ch in range(len(s)):
            if (s[ch] in charMap and t[ch] != charMap[s[ch]]) or (t[ch] in seCharMap and s[ch] != seCharMap[t[ch]]):
                return False
            
            charMap[s[ch]] = t[ch]
            seCharMap[t[ch]] = s[ch]
        
        return True

        