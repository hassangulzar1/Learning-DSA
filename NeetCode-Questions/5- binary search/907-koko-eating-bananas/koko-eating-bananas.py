class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        s,e = 1, max(piles)
        res = 0

        while s <= e:
            hours = 0

            mid = (s + e) // 2
            for p in piles:
                hours += math.ceil(p/mid)

            if hours <= h:
                e = mid - 1
                res = mid
            else:
                s = mid + 1

        return res


