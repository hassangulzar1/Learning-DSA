class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        curr = []
        candidates.sort()

        def dfs(i,total):
            if total == target:
                res.append(curr.copy())
                return
            
            if i >= len(candidates) or total > target:
                return
            
            prev = -1
            for j in range(i,len(candidates)):
                if candidates[j] == prev:
                    continue
                
                curr.append(candidates[j])
                dfs(j + 1,total + candidates[j])
                curr.pop()

                prev = candidates[j]
                
            
        dfs(0,0)

        return res


        