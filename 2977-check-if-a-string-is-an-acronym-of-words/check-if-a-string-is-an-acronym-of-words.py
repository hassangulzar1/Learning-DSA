class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:

        count = 0;

        if len(words) != len(s):
            return False
        
        for i in range(len(words)):
            if words[i].startswith(s[i]):
                count += 1
            else:
                return False

            
        return True
        