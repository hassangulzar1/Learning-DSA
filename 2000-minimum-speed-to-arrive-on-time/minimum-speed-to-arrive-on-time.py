class Solution:
    def minSpeedOnTime(self, dist: List[int], hour: float) -> int:
        import math
        s,e = 1,10**7

        while s <= e:
            mid = (s + e)//2
            h = 0

            for i in range(len(dist) -1 ):
                h += math.ceil(dist[i] / mid)
            
            h += dist[-1] / mid

            if h <= hour:
                e = mid - 1
            else:
                s = mid + 1
        
        return -1 if s > 10**7 else s
        