class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        minHeap = []
        for x,y in points:
          temp = (x**2) + (y**2)
          minHeap.append([temp,x,y])
    

        heapq.heapify(minHeap)

        res = []
        for i in range(k):
          temp = heapq.heappop(minHeap)
          res.append(temp[1:])
          
        return res
