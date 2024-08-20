class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:
        N = len(points)
        adj = collections.defaultdict(list)
        for i in range(N):
            x1,y1 = points[i]

            for j in range(i+1,N):

                x2,y2 = points[j]

                dist = abs(x1-x2) + abs(y1 - y2)
                adj[i].append([dist,j])
                adj[j].append([dist,i])
        
        visit = set()
        minHeap = [[0,0]]
        res = 0

        while len(visit) < N:
            cost,node = heapq.heappop(minHeap)
            if node in visit:
                continue
            
            res += cost
            visit.add(node)

            for neiCost,nei in adj[node]:
                if nei not in visit:
                    heapq.heappush(minHeap, [neiCost,nei])

        return res
        