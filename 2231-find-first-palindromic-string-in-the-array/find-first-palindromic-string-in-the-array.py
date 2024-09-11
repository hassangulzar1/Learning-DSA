class Solution:
    def isPalidrome(self,string):
        s = 0
        e = len(string) - 1
        while s < e:
            if string[s] == string[e]:
                s += 1
                e -= 1
            else:
                return False
        return True
                

    def firstPalindrome(self, words: List[str]) -> str:
        for st in words:
            if self.isPalidrome(st):
                return st
        return ""
        