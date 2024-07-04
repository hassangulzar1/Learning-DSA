class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:

        wordLen = len(words)
        sLen = len(s)
        if wordLen!= sLen:
            return False
        
        for i in range(wordLen):
            if not words[i].startswith(s[i]):
                return False

            
        return True
        