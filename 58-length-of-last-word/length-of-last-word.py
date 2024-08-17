class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.rstrip()
        count = 0
        for char in s:
            count += 1
            
            if char == " ":
               count = 0

        return count

        