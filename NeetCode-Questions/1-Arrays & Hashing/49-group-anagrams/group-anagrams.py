class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        pairs = {}

        for i in range(len(strs)):
            sortedStr = "".join(sorted(strs[i]))
            print(sortedStr)
            if sortedStr not in pairs:
                pairs[sortedStr] = []
            
            pairs[sortedStr].append(strs[i])
        ans = []
        for key, value in pairs.items():
            ans.append(value)
        return ans

        