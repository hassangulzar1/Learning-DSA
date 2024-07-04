class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:

        wordLen = len(words)
        sLen = len(s)
        if wordLen!= sLen:
            return False
        
        for i in range(wordLen):
            if words[i].startswith(s[i]):
                None
            else:
                return False

            
        return True
        