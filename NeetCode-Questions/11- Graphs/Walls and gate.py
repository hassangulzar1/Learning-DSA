class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        ROWS,COLS = len(grid),len(grid[0])

        visit = set()
        q = collections.deque()

        for r in range(ROWS):
            for c in range(COLS):
                if grid[r][c] == 0:
                    visit.add((r,c))
                    q.append((r,c))
        dist = 0

        def bfs(r,c):
            if min(r,c) < 0 or r == ROWS or c == COLS or (r,c) in visit or grid[r][c] == -1:
                return
            
            q.append((r,c))
            visit.add((r,c))

        while q:
            for i in range(len(q)):
                r,c = q.popleft()

                grid[r][c] = dist
                bfs(r+1,c)
                bfs(r-1,c)
                bfs(r,c+1)
                bfs(r,c-1)
            dist += 1