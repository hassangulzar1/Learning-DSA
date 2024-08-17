class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        commonSub = ""

        for curr in range(len(strs[0])):
            for s in strs:
                if curr == len(s) or s[curr] != strs[0][curr]:
                    return commonSub    
            commonSub += strs[0][curr]

        return commonSub

        