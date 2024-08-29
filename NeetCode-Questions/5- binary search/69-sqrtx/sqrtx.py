class Solution:
    def mySqrt(self, x: int) -> int:
        s ,e = 1, x
        res = 0

        while s <= e:
            mid  = (s + e) // 2
            sqroot = mid * mid
            if sqroot == x:
                return mid
            elif sqroot < x:
                s = mid + 1
            else:
                e = mid - 1
        return e

           
                
        