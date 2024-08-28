class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        s = 1
        e = num

        while s <= e:
            mid = (s + e) // 2
            sqre = mid * mid

            if sqre == num:
                return True
            elif sqre > num:
                e = mid -1
            else:
                s = mid + 1
        return False
        