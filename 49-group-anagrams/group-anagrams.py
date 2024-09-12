class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        pairs = {} 

        for i in range(len(strs)):
            sortedStr = "".join(sorted(strs[i]))
            if sortedStr not in pairs:
                pairs[sortedStr] = []
                
            pairs[sortedStr].append(strs[i])

        ans = []
        for key,val in pairs.items():
            ans.append(val)
        return ans
        


        

            
            
            





        