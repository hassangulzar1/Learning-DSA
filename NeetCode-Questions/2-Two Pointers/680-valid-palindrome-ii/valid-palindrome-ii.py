class Solution:
    def isPlindrom(self, s,e,string):
        while s<e:
            if string[s] == string[e]:
             s += 1
             e -= 1
            else:
             return False
        return True

    def validPalindrome(self, s: str) -> bool:
        fistRem = True

        start = 0
        end = len(s) - 1

        while start < end:
            if s[start] == s[end]:
                start += 1
                end -= 1
            else:
                return self.isPlindrom(start+1,end,s) or self.isPlindrom(start, end - 1, s)
        return True

        