class Solution:
    def reverseWords(self, s: str) -> str:
        s = list(s)
        l = 0
        for r in range(len(s)):
            if s[r] == " " or r == len(s) - 1:                
                left,right = l, r - 1

                if r == len(s) - 1:
                    right = r

                while left < right:
                    s[left],s[right] = s[right],s[left]
                    left += 1
                    right -= 1
                l = r + 1
        return "".join(s)


            
        
        