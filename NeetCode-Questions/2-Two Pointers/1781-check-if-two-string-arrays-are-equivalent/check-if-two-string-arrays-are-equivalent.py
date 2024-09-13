class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        str1 = ""
        str2 = ""
        for ch in word1:
            if str1 and ch != str1[-1]:
                str1 += ch
            elif not str1:
                str1 += ch

        for ch in word2:
            if str2 and ch != str2[-1]:
                str2 += ch    
            elif not str2:
                str2 += ch

        return str1 == str2
        