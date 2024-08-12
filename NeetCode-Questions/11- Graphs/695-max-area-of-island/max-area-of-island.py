class Solution:

    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

        rows ,cols = len(grid), len(grid[0])
        visit = set()
        maxCount = 0

        def bfs(r,c):
            q = collections.deque()
            visit.add((r,c))
            q.append((r,c))
            currCount = 0

            while q:
               currCount += 1               
               row ,col = q.popleft()
               direction = [[1,0],[-1,0],[0,1],[0,-1]]

               for dr,dc in direction:
                    r,c = dr + row , col + dc

                    if r in range(rows) and c in range(cols) and ((r,c) not in visit) and grid[r][c] == 1:
                        q.append((r,c))
                        visit.add((r,c))
            return currCount
            

        for r in range(rows):
            for c in range(cols):
               if grid[r][c] == 1 and ((r,c) not in visit):                    
                   cnt = bfs(r,c)
                   maxCount = max(maxCount,cnt)
        
        return maxCount        