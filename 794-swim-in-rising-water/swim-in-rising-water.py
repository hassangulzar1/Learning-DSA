class Solution:
    def swimInWater(self, grid: List[List[int]]) -> int:
        N = len(grid)
        visit = set((0,0))
        minHeap = [[grid[0][0], 0, 0]]
        direction = [[0,1],[0,-1],[1,0],[-1,0]]

        while minHeap:
            t,r,c = heapq.heappop(minHeap)

            if r == N -1 and c == N - 1:
                return t
            
            for dr,dc in direction:
                row,col = dr + r, dc + c

                if min(row,col) < 0 or row == N or col == N or (row,col) in visit:
                    continue
                
                visit.add((row,col))
                heapq.heappush(minHeap, [max(grid[row][col], t), row, col])
        