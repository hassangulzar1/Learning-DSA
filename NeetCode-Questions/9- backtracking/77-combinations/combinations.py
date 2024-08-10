class Solution:



    def combine(self, n: int, k: int) -> List[List[int]]:
        combo = []

        def fun(start,curr):
            if len(curr) == k:
                combo.append(curr.copy())
                return
            
            
            for i in range(start,n + 1):
                curr.append(i)
                fun(i + 1,curr)
                curr.pop()

        fun(1,[])

        return combo

      