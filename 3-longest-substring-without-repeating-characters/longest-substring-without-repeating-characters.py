class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        LongestSubstr = 0
        left = 0

        stringSet = set()

        for i in range(len(s)):
            while s[i] in stringSet:
                stringSet.remove(s[left])
                left+= 1
            
            stringSet.add(s[i])
            LongestSubstr = max(LongestSubstr,i - left + 1)

        return LongestSubstr
    