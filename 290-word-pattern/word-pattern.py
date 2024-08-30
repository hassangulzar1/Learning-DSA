class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patMap = {}
        sMap = {}
   
        s = s.split(" ")
        if len(s) != len(pattern): return False
        for ch in range(len(pattern)):
            if (pattern[ch] in patMap and s[ch] != patMap[pattern[ch]] ) or (s[ch] in sMap and pattern[ch] != sMap[s[ch] ]):
                return False

            patMap[pattern[ch]] = s[ch]
            sMap[s[ch]] = pattern[ch]
            
        return True


        