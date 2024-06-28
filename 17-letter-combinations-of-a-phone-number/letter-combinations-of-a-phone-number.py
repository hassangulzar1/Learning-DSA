class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []

        self.digit_to_char = {
            '2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
            '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'
        }
        return self.subSeq("",digits)
    

    def subSeq(self,p,up)->List[str]:
        if up == "":
          return [p]
    
        digit = up[0]
        char = self.digit_to_char[digit]

        ans = []

        for ch in char:
          ans.extend(self.subSeq(p + ch, up[1:]))
    
        return ans
        