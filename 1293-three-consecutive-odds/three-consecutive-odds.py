class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        is_count = 0
        for i in arr:
            if i % 2 == 0:
                is_count = 0
            else:
                is_count += 1
            if is_count == 3:
                return True
        return False

        