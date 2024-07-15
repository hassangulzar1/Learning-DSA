class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = []
        maping = {}

        for string in strs:           
            sorted_s = ''.join(sorted(string))

            if sorted_s not in maping:
                maping[sorted_s] = []

            maping[sorted_s].append(string)
        
        for key, value in maping.items():
            ans.append(value)
        
        return ans
        
        

        