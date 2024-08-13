class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        ROWS,COLS = len(grid),len(grid[0])
        fresh,time = 0,0

        q = collections.deque()

        for r in range(ROWS):
            for c in range(COLS):
                if grid[r][c] == 1:
                    fresh += 1
                
                if grid[r][c] == 2:
                    q.append((r,c))

        direction = [[0,1],[0,-1],[1,0],[-1,0]]
        
        while q and fresh > 0:            
            for i in range(len(q)):
                r,c = q.popleft()

                for dr,dc in direction:
                    row,col = dr + r, dc + c

                    if (
                        row in range(len(grid))
                        and col in range(len(grid[0]))
                        and grid[row][col] == 1
                    ):
                        grid[row][col] = 2
                        q.append((row, col))
                        fresh -= 1
            time += 1

        return time if fresh == 0 else -1




        