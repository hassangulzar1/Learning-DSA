from typing import List

class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        c = 0
        for i in range(len(flowerbed)):
            if (i == 0 and flowerbed[i] == 0 and (len(flowerbed) == 1 or flowerbed[i + 1] == 0)) or \
               (i == len(flowerbed) - 1 and flowerbed[i] == 0 and flowerbed[i - 1] == 0):
                c += 1
                flowerbed[i] = 1
            elif i > 0 and i < len(flowerbed) - 1 and flowerbed[i] == 0 and flowerbed[i - 1] == 0 and flowerbed[i + 1] == 0:
                c += 1
                flowerbed[i] = 1
        
        return c >= n
