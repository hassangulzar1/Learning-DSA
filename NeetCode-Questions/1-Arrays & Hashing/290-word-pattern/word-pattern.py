class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(s) != len(pattern): return False

        charMap = {}
        wordMap = {}
   

        for c, w in zip(pattern,s):
            if c in charMap and charMap[c] != w:
                return False
            if w in wordMap and wordMap[w] != c:
                return False
            charMap[c] = w
            wordMap[w] = c
            
        return True


        